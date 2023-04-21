package com.mygenerics;

import java.util.ArrayList;

public class ListUtil {

    private ListUtil(){};
    public static<T> void addAll(ArrayList<T> list, T t1,T t2,T t3, T t4){
        list.add(t1);
        list.add(t2);
        list.add(t3);
        list.add(t4);
    }
}
