package com.mygenerics;

import com.rockstar.homework.home4.A;

import java.util.ArrayList;

public class GenericsDemo2 {
    public static void main(String[] args) {
        /*MyArrayList<String> list = new MyArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        System.out.println(list);*/

        ArrayList<String> list = new ArrayList<>();
        ListUtil.addAll(list,"aaa","bbb","ccc","ddd");

        System.out.println(list);
    }
}
