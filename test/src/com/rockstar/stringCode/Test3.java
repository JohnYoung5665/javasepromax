package com.rockstar.stringCode;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串:");
        String str = sc.next();

        Random r = new Random();
        char[] c = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            c[i] = str.charAt(i);
        }
        for (int i = 0; i < c.length; i++) {
            int index = r.nextInt(c.length);
            char c1 = c[index];
            c[index] = c[i];
            c[i] = c[index];
        }

        String s = new String(c);
        System.out.println(s);
    }
}
