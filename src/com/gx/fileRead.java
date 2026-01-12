package com.gx;
import java.io.*;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class fileRead {
    public static void fileReader() {
        System.out.println("请按照example.txt内的提示创建文件并填好您的数据。");
        while (true) {
            System.out.print("请输入文件名");
            String filePath = readInput.rInput().trim();
            System.out.print("确认开始读取您的文件吗？（Y确认，Q退出）");
            String str = readInput.rInput();
            if (str.equalsIgnoreCase("Y")) {
                try {
                    math(filePath);
                } catch(Exception e) {
                    System.out.println("读取失败！");
                    System.out.println();
                }
            }
            else if (str.equalsIgnoreCase("Q")) {
                System.out.println();
                break;
            }
            else {
                System.out.println("请输入有效字母！");
                continue;
            }
        }
    }
    public static List<String> readAllLines(String filePath) throws IOException {
        List<String> lines = new ArrayList<>();
        File file = new File(filePath);
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(filePath), "UTF-8"))) {
           String line;
           while ((line = br.readLine()) != null) {
               if (!line.trim().isEmpty()) {
                   lines.add(line);
               }
           }
        }
        return lines;
    }
    public static void math(String filePath) {
        try {
            List<String> lines = readAllLines(filePath);
            System.out.println();
            System.out.print("请输入数字（1. 求根; 2. 求值; 3. 退出）：");
            String toDo = readInput.rInput();
            if (toDo.equals("1")) {
                for (int i = 0; i < lines.size(); i++) {
                    try {
                        String line = lines.get(i);
                        String[] part = line.split("[,，;；\\s]+");
                        List<String> lists = new ArrayList<>(Arrays.asList(part));
                        String inputN = lists.get(0);
                        int listsNum = lists.size() - 1;
                        String inputA = "";
                        List<String> list = lists.subList(1, listsNum - 1);
                        for (int j = 0; j < list.size(); j++) {
                            inputA = inputA + list.get(j) + " ";
                        }
                        String x0 = lists.get(listsNum - 1);
                        String approachNum = lists.get(listsNum);
                        System.out.println("第" + (i + 1) + "行：" + sE.solveEquation(inputN, inputA, x0, approachNum));
                    } catch(Exception e) {
                        System.out.println("请检查第" + (i + 1) + "行格式是否正确");
                    }
                }
            }
            else if (toDo.equals("2")) {
                for (int i = 0; i < lines.size(); i++) {
                    try {
                        String line = lines.get(i);
                        String[] part = line.split(" ");
                        List<String> lists = new ArrayList<>(Arrays.asList(part));
                        String inputN = lists.get(0);
                        float n = Float.parseFloat(inputN);
                        int listsNum = lists.size() - 1;
                        List<String> list = new ArrayList<>(lists.subList(1,listsNum));
                        String x = lists.get(listsNum);
                        float x0 = Float.parseFloat(x);
                        System.out.println("第" + (i + 1) + "行：" + sE.mathTample(x0, list));
                    } catch(Exception e) {
                        System.out.println("请检查第" + (i + 1) + "行格式是否正确");
                    }
                }
            }
            else if (toDo.equals("3")) {
                return;
            }
            else {
                System.out.println("请输入有效数字！");
                math(filePath);
            }
        } catch(Exception e) {
            throw new RuntimeException("读取失败");
        }
    }
}
