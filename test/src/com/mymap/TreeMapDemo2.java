package com.mymap;

import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Student, String> tm = new TreeMap<>();

        Student s1 = new Student("zhangsan",26);
        Student s2 = new Student("lisi",26);
        Student s3 = new Student("wangwu",26);

        tm.put(s1,"江苏");
        tm.put(s2,"天津");
        tm.put(s3,"北京");

        System.out.println(tm);
    }

}
