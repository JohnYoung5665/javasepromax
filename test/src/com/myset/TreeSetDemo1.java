package com.myset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        /*
            需求：利用TreeSet存储整数并进行排序
         */

        //1.创建TreeSet集合对象
        TreeSet<Integer> list = new TreeSet<>();

        //2.添加元素
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(3);
        list.add(2);

        //3.打印集合
        System.out.println(list);

        //4.遍历集合（三种遍历方式）
        //迭代器
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.println(i);
        }
        System.out.println("============================");
        //增强for
        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println("============================");
        //Lambda表达式
        list.forEach(i-> System.out.println(i));

    }
}
