package com.rockstar.stringCode;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("张旭");
//        sb.append("埃隆马斯克");
//        System.out.println(sb);
//
////        sb.reverse();
////        System.out.println(sb);
//
//        int len = sb.length();
//        System.out.println(len);
//
//        String s = sb.toString();
//        System.out.println(s);
//
//        System.out.println(s.equals(sb));

        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串：");
        String str = sc.next();
        String str1 = new StringBuilder().append(str).reverse().toString();
        System.out.println(str1.equals(str) ? "是" : "不是");
//        String str2 = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            char ch = str.charAt(i);
//            str2 += ch;
//        }
//        System.out.println(str2);
//        if (str.equals(str2)){
//            System.out.println("是");
//        }else {
//            System.out.println("不是");
//        }

    }
}
