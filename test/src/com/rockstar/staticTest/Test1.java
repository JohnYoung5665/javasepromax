package com.rockstar.staticTest;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student s1 = new Student("张旭",22,"男");
        Student s2 = new Student("埃隆马斯克",50,"男");
        Student s3 = new Student("雷军",55,"男");
        list.add(s1);
        list.add(s2);
        list.add(s3);

        int maxAge = Util.getMaxAge(list);
        System.out.println(maxAge);
    }
}
