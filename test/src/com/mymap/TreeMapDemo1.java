package com.mymap;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo1 {

    public static void main(String[] args) {
        //Integer Double 类里面自己实现了Comparator接口，重写了compare方法，按照升序排序
        //String 按照字母在ASCII码表中对应的数字进行升序排序
        //abcdefg....

        //升序
        //TreeMap<Integer, String> tm = new TreeMap<>();

        //降序
        TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //o1:表示当前要添加的元素
                //o2:表示已经在红黑树中存在的元素
                return o2 - o1;
            }
        });
        tm.put(1,"软延安");
        tm.put(3,"利群");
        tm.put(2,"万宝路");

        System.out.println(tm);
    }
}
