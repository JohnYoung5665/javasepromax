package com.rockstar.regexdemo;

public class Test {
    public static void main(String[] args) {
        //public String replaceAll(String regex, String newStr) 按照正则表达式的规则进行替换
        //public String[] split(String regex)   按照正则表达式的规则切割字符串

        String s = "小诗诗dqwesafasfasffasf1254小丹丹dxczxcgdfgdfg5415613小惠惠";

        //1、替换
        System.out.println(s.replaceAll("[\\w&&[^_]]+", "vs"));

        //2、切割字符串
        String[] arr = s.split("[\\w&&[^_]]+");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
