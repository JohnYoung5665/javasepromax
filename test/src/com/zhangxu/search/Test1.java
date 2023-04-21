package com.zhangxu.search;

import java.util.ArrayList;

public class Test1 {
    //基本查找/顺序查找
    //说明：顺序查找适合于存储结构为数组或者链表。
    public static void main(String[] args) {
        //课堂练习1
        //需求：定义一个方法利用基本查找，查询某个元素在数组中的索引
        //要求：不需要考虑数组中元素是否重复
        int[] arr = {131, 127, 147, 81, 103, 23, 7, 79, 81};
        System.out.println(basic1(arr));

        ArrayList<Integer> list = basic2(arr);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //
    }

    //2
    public static ArrayList<Integer> basic2(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 81){
                list.add(i);
            }
        }
        return list;
    }

    //1
    public static int basic1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 103){
                return i;
            }
        }
        return -1;
    }
}
