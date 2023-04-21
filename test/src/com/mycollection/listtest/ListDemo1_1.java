package com.mycollection.listtest;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1_1 {
    public static void main(String[] args) {
        //List集合系列中的两个删除的方法
        //1.直接删除元素
        //2.通过索引进行删除

        //1.创建集合并添加元素
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        //2.删除元素
        //在调用方法的时候，如果方法出现了重载现象
        //优先调用，实参跟形参类型一致的那个方法

        //此时是根据索引进行删除，因为”1“当前是int类型的数据
//        list.remove(1);

        //手动装箱，手动把基本数据类型的1，变成Integer类型
        Integer i = Integer.valueOf(1);
        list.remove(i);

        System.out.println(list);
    }
}
