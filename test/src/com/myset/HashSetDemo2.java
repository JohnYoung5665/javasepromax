package com.myset;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student("张旭",22);
        Student s2 = new Student("张旭",22);
        Student s3 = new Student("李四",30);

        HashSet<Student> list = new HashSet<>();

        System.out.println(list.add(s1));
        System.out.println(list.add(s2));
        System.out.println(list.add(s3));

        System.out.println(list);


    }
}
