package com.myset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        Student s1 = new Student("张旭",22);
        Student s2 = new Student("张旭",22);
        Student s3 = new Student("李四",30);

        LinkedHashSet<Student> list = new LinkedHashSet<>();

        list.add(s3);
        list.add(s2);
        list.add(s1);

        System.out.println(list);
    }
}
