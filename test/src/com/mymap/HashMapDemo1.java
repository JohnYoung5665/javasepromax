package com.mymap;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class HashMapDemo1 {
    public static void main(String[] args) {
        /*
        需求：创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)。
        存储三个键值对元素，并遍历
        要求：同姓名，同年龄认为是同一个学生

        核心点：
            HashMap的键位置如果存储的是自定义对象，需要重写hashCode和equals方法。
       */

        //1.创建Student对象
        Student s1 = new Student("zhangsan",23);
        Student s2 = new Student("lisi",24);
        Student s3 = new Student("wangwu",25);
        Student s4 = new Student("wangwu",25);

        //2.创建HashMap集合
        HashMap<Student, String> hm = new HashMap<>();

        //3.添加元素
        hm.put(s1,"陕西");
        hm.put(s2,"上海");
        hm.put(s3,"江西");
        hm.put(s4,"香港");

        for (Map.Entry<Student, String> entry : hm.entrySet()) {
            Student key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }

    }
}
