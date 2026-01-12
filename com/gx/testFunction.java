package com.gx;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class testFunction {
    public static void test() {
        while (true) {
            System.out.print("请输入次数：");
            String inputN = readInput.rInput();
            System.out.print("请以从高次到低次的顺序输入系数（格式：a b c）：");
            String inputA = readInput.rInput();
            System.out.print("请输入自变量值：");
            String x = readInput.rInput();
            try {
                String[] part = inputA.split(" ");
                List<String> list = new ArrayList<>(Arrays.asList(part));
                float x0 = Float.parseFloat(x);
                float n = Float.parseFloat(inputN);
                if (n != list.size() - 1) {
                    System.out.println("请输入正确格式！");
                    System.out.println();
                    break;
                }
                System.out.println("结果是："  + sE.mathTample(x0, list));
                System.out.println();
                System.out.print("按Q返回主菜单，其余任意键继续");
                if (readInput.rInput().equalsIgnoreCase("Q")) {
                    System.out.println();
                    break;
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println("请输入正确格式！");
                System.out.print("按C继续，按其余任意键返回主菜单：");
                String str = readInput.rInput();
                if (str.equalsIgnoreCase("c")) {
                    System.out.println();
                    break;
                }
                System.out.println();
                return;
            }
        }
    }
}
