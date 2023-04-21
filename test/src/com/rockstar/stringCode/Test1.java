package com.rockstar.stringCode;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;

        while (true) {
            System.out.println("请输入字符串：");
            str = sc.next();
            boolean flog = panduan(str);
            if (flog){
                break;
            }else {
                System.out.println("字符串有误！");
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
//            int number = c - 48;
//            String s = chageLuoMa(number);
//            sb.append(s);

                String s = chageLuoMa(c);
                sb.append(s);
        }
        System.out.println(sb);


    }

    public static String chageLuoMa(char number){
        String str = switch (number){
            case '0' -> "";
            case '1' -> "Ⅰ";
            case '2' -> "Ⅱ";
            case '3' -> "Ⅲ";
            case '4' -> "Ⅳ";
            case '5' -> "Ⅴ";
            case '6' -> "Ⅵ";
            case '7' -> "Ⅶ";
            case '8' -> "Ⅷ";
            case '9' -> "Ⅸ";
            default -> str = "";
        };
        return str;
    }


    public static String chageLuoMa(int number){
        String[] arr1 = {"","Ⅰ", "Ⅱ", "Ⅲ", "Ⅳ", "Ⅴ", "Ⅵ", "Ⅶ", "Ⅷ", "Ⅸ"};
        return arr1[number];
    }

    public static Boolean panduan(String str){
        if (str.length() > 9){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c > '9' || c < '0'){
                return false;
            }
        }
        return true;
    }
}
