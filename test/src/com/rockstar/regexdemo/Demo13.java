package com.rockstar.regexdemo;

public class Demo13 {
    public static void main(String[] args) {
        String str = "我要学学编编编编程程程程程程";


        //(.):表示把重复内容的第一个字符看作一组
        // \\1 :表示第一个字符再次出现
        //  + 至少一次
        // $1 表示把正则表达式中的第一组的内容，再拿出来用
        String s = str.replaceAll("(.)\\1+", "$1");
        System.out.println(s);

    }
}
