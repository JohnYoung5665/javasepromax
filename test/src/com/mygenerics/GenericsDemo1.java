package com.mygenerics;

import java.util.ArrayList;

public class GenericsDemo1 {
    public static void main(String[] args) {
        //没有泛型的时候，集合如何存储数据
        //结论：
        //如果我们没有给集合指定类型，默认认为所有的数据类型都是Object类型
        //此时可以往集合添加任意的数据类型
        //但是带来了一个坏处：我们在获取数据的时候。无法使用它的特有行为。

        //此时推出了泛型，可以在添加数据的时候就把类型进行统一
        //而且我们在获取数据的时候，也省的强转了，非常的方便

        //1.创建集合对象
        ArrayList<Student> list = new ArrayList<Student>();
        //添加数据
//        list.add(123);
//        list.add("aaa");
        list.add(new Student("张旭",22));

        list.get(0).eat();
    }
}
