package com.mycollection.listtest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListPrint {
    public static void main(String[] args) {
        /*
            List集合的遍历方式：
                1.迭代器
                2.增强for
                3.Lambda表达式
                4.普通for循环
                5.列表迭代器（List集合独有）:
                    ListIterator
         */

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("ccc");
        list.add("ddd");

        //1.迭代器
        /*Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }*/

        //2.增强for
        //下面的变量s，其实就是一个第三方变量而已
        //在循环过程中，依次表示集合中的每一个元素
        /*for (String s : list) {
            System.out.println(s);
        }*/

        //3.Lambda表达式
        //forEach方法的底层其实就是一个遍历循环，依次得到集合中的每一个元素
        //并把每一个元素传递给下面的accept方法
        //accept方法的形参s，依次表示集合中的每一个元素
        //list.forEach(s-> System.out.println(s));

        //4.普通for循环
        //size方法跟get方法还有循环结合的方式，利用索引获取到集合中每一个元素
        /*for (int i = 0; i < list.size(); i++) {
            //i:依次表示集合中的每一个索引
            System.out.println(list.get(i));
        }*/

        //5.列表迭代器
        //获取一个列表迭代器对象，里面的指针默认也是指向0索引的

        //额外添加了一个方法：在遍历的过程中，可以添加元素
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }

    }
}
