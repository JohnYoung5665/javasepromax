package com.rockstar.objectdemo;

import java.util.Objects;

public class ObjectsTest {
//    public static String toString(Object o) 					// 获取对象的字符串表现形式
//    public static boolean equals(Object a, Object b)			// 比较两个对象是否相等
//    public static boolean isNull(Object obj)					// 判断对象是否为null
//    public static boolean nonNull(Object obj)					// 判断对象是否不为null
    public static void main(String[] args) {
        Dog d1 = new Dog("哈士奇",2);
        System.out.println(Objects.toString(d1));
        System.out.println("==========================");
        Dog d2 = new Dog("哈士奇",2);
        System.out.println(Objects.equals(d1, d2));
        System.out.println("==========================");
        Dog d3 = d1;
        System.out.println(Objects.nonNull(d3));
        System.out.println("==========================");


    }
}
