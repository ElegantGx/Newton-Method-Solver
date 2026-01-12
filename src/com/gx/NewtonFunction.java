package com.gx;

public class NewtonFunction {
    public static void newtonFunction() {
        while (true) {
            try {
                while (true) {
                    System.out.print("请输入次数：");
                    String inputN = readInput.rInput();
                    System.out.print("请以从高次到低次的顺序输入系数（格式：a b c）：");
                    String inputA = readInput.rInput();
                    System.out.print("输入你预估的根：");
                    String x0 = readInput.rInput();
                    System.out.print("输入目标迭代次数：");
                    String approachNum = readInput.rInput();
                    System.out.println(sE.solveEquation(inputN, inputA, x0, approachNum));
                    System.out.print("返回主菜单请按Q");
                    String stR = readInput.rInput();
                    if (stR.equalsIgnoreCase("Q")) {
                        return;
                    }
                    System.out.println();
                }
            } catch (Exception e) {
                System.out.println("请输入有解方程且格式正确。也许初值点是发散的。");
                System.out.print("按Q返回主菜单");
                if (readInput.rInput().equalsIgnoreCase("Q")) {
                    System.out.println();
                    return;
                }
                System.out.println();
            }
        }
    }
}
