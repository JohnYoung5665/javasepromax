package com.rockstar.regexdemo;

public class Test1 {
    public static void main(String[] args) {
        String qq = "13a61333689";
        System.out.println(qq.matches("[1-9]\\d{5,19}"));


        //     \  转义字符  改变后面那个字符原本的含义
        //练习： 以字符串形式打印一个双引号
        // “在Java中表示字符串的开头或者结尾

        //此时\表示转义字符，改变了后面那个双引号原本的含义
        //把它变成了一个普普通通的双引号而已
        System.out.println("\"");

        //    \ 表示转义字符
        //   \\ 前面的\是一个转义字符，改变了后面\原本的含义，把它变成了一个普普通通的\而已
        System.out.println("\\");
    }
}
