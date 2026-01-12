package com.gx;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("这是一个求一元高次函数零点的小数近似的程序");
            System.out.println("请整理成标准形式输入");
            System.out.println("功能列表：");
            System.out.println("1. 直接求根（牛顿法）");
            System.out.println("2. 求函数值");
            System.out.println("3. 文件批量求根");
            System.out.println("4. 退出");
            System.out.print("选择功能（1, 2, 3, 4）：");
            String str = readInput.rInput();
            if (str.equals("1")) {
                NewtonFunction.newtonFunction();
            }
            else if (str.equals("2")) {
                testFunction.test();
            }
            else if (str.equals("3")) {
                fileRead.fileReader();
            }
            else if (str.equals("4")) {
                return;
            }
            else {
                System.out.println("请输入有效数字");
                System.out.println();
            }
        }
    }
}
