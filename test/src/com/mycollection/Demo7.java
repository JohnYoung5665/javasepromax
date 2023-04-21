package com.mycollection;

import com.rockstar.homework.home4.A;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public class Demo7 {
    public static void main(String[] args) {
        /* Collection系列集合三种通用的遍历方式：
            1.迭代器遍历
            2.增强for遍历
            3.lambda表达式遍历

            lambda表达式遍历：
                    default void forEach(Consumer<? super T> action):
         */
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        //利用匿名内部类的形式
        //底层原理：
        //其实也会自己遍历集合，依次得到每一个元素
        //把得到的每一个元素，传递给下面的accept方法
        //s依次表示集合中的每一个数据
        /*coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        //Lambda表达式写法
        coll.forEach(s -> System.out.println(s));

    }
}
