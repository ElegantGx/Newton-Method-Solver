package com.gx;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class sE {
    public static String solveEquation (String inputN, String inputA, String x, String approachNum) {
        try {
            float n = Float.parseFloat(inputN);
            String[] part = inputA.split(" ");
            List<String> list = new ArrayList<>(Arrays.asList(part));
            float x0 = Float.parseFloat(x);
            if (n != list.size() - 1) {
                throw new Exception("请输入正确格式！");
            }
            float answer = mathFunction(x0, list, approachNum);
            if (Float.isNaN(answer)) {
                return "计算失败";
            }
            return "在x0附近存在近似解：" + answer;
        } catch (Exception e) {
            return "请输入正确格式！";
        }
    }
    public static float mathFunction(float x0, List<String> list, String approachNum) {
        int commonNum = Integer.parseInt(approachNum);
        for (int mortis = commonNum; mortis > 0; mortis--) {
            float y = mathTample(x0, list);
            if (Math.abs(y) < 1e-6f) {
                return x0;
            }
            if (Math.abs(d(x0, list)) < 1e-10f) {
                System.out.println("dy/dx = 0, 请重新设定初始值");
                System.out.println();
                break;
            }
            x0 = x0 - y / d(x0, list);
        }
        System.out.println("无法得到近似解，请检查初始值是否收敛");
        return Float.NaN;
    }
    public static float mathTample(float x0, List<String> list) {
        float y = 0;
        for (int i = 0; i < list.size(); i++) {
            float N = list.size() - i - 1;
            if (N > 0) {
                y = y + Float.parseFloat(list.get(i)) * ((float)Math.pow(x0, N));
            }
            else {
                y = y + Float.parseFloat(list.get(i));
            }
        }
        return y;
    }
    public static float d(float x0, List<String> list) {
        float dyBdx = 0;
        for (int i = 0; i < list.size(); i++) {
            float N = list.size() - i - 1;
            if (N > 0) {
                dyBdx = dyBdx + (Float.parseFloat(list.get(i))) * N * ((float) Math.pow(x0, N - 1));
            }
        }
        return dyBdx;
    }
}
