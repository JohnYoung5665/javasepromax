package com.rockstar.stringCode;

public class Test2_1 {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "eabcd";

    }

    public static String rotate(String strA){
        char[] arr = strA.toCharArray();
        char s = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = s;

        String result = new String(arr);
        return result;
    }
}
