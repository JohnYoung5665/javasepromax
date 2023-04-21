package com.rockstar.regexdemo;

public class Demo12 {
    public static void main(String[] args) {
        //需求1：判断一个字符串的开始字符和结束字符是否一致？只考虑一个字符
        //举例： a123a     b456b    17891  &abc&       a123b(false)
        String regex1 = "(.).+\\1";
        String s1 ="&abc&";
        System.out.println(s1.matches(regex1));

        System.out.println("=======================");

        //需求2：判断一个字符串的开始字符和结束字符是否一致？可以有多个字符
        //举例： abc123abc     b456b    123789123  &!@abc&!@       abc123abd(false)
        String regex2 = "(.+).+\\1";
        System.out.println("abc123abd".matches(regex2));

        System.out.println("=======================");

        //需求2：判断一个字符串的开始字符和结束字符是否一致？开始部分内部每个字符也需要一致
        //举例：   aaa123aaa   bbb456bbb   111789111   &&abc&&

        //(.):把首字母看作一组
        //  \\2：把首字母拿出来再次使用
        //  *：作用于\\2，表示后面重复的内容出现0次或多次
        String regex3 = "((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3));
    }
}
