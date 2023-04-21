package com.rockstar.stringCode;

public class Test2 {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "eabcd";
        System.out.println(check(strA, strB));
    }

    public static boolean check(String strA, String strB){
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            System.out.println(strA);
            if (strA.equals(strB)){
                return true;
            }
        }
        return false;
    }

    public static String rotate(String strA){
        char c = strA.charAt(0);
        String s = strA.substring(1);
        return s + c;
    }


}
