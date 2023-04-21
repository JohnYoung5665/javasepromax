package com.mymap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TreeMapDemo3 {
    public static void main(String[] args) {

        //1.定义字符串
        String str = "aababcabcdabcdexx";

        //2.创建集合
        TreeMap<Character,Integer> tm = new TreeMap<>();

        //3.遍历字符串得到里面的每一个字符
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //拿着c到集合中判断是否存在
            //存在，表示当前字符又出现了一次
            //不存在，表示当前字符是第一次出现
            if (tm.containsKey(c)){
                //存在
                //先把已经出现的次数拿出来
                Integer count = tm.get(c);
                //次数加1
                tm.put(c, count + 1);
            }else {
                //不存在
                tm.put(c,1);
            }
        }

        //4.遍历集合，并按照指定的格式进行拼接
        StringBuilder sb = new StringBuilder();
        tm.forEach((character, integer) -> sb.append(character).append("(").append(integer).append(")"));

        System.out.println(sb);

    }
}
