package com.mycollection;

import java.util.ArrayList;
import java.util.Collection;

public class IntensifierFor {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        for (int i : arr) {
//            System.out.println(i);
//        }

        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        for (String s : coll) {
            System.out.println(s);
        }
    }
}
