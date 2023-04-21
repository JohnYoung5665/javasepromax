package com.zhangxu.arraysTest;

import java.util.Arrays;

public class ArrayTest1 {
    public static void main(String[] args) {
        /*
            public static String toString(数组)                       把数组拼接成一个字符串
            public static int binarySearch(数组，查找的元素)            二分查找法查找元素
            public static int[] copyOf(原数组，新数组的长度)             拷贝数组
            public static int[] copyOfRange(原数组，起始索引，结束索引)   拷贝数组(指定范围)
            public static void fill(数组，元素)                         填充数组
            public static void sort(数组)                             按照默认的方式进行数组排序
            public static void sort(数组,排序规则)                    按照指定的规则排序
         */

        //toString:把数组拼接成一个字符串
        System.out.println("-----------------toString-----------------");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String string = Arrays.toString(arr);
        System.out.println(string);

        //binarySearch:二分查找法查找元素
        System.out.println("-----------------binarySearch-----------------");
        //细节1：二分查找的前提：数组中的元素必须是有序的，数组中的元素必须是升序的
        //细节2：如果要查找的元素是存在的，那么返回的是真实的索引
        //但是，如果要查找的元素是不存在的，返回的是 (-插入点 - 1)
        //为什么要减1呢
        //解释：如果此时，我现在要查找数字0，那么如果返回的值是-插入点，就会出现问题了
        //如果要查找数字0，此时0是不存在的，但是按照上面的规则-插入点，应该就是-0
        //为了避免这样的情况，Java在这个基础上又减1.
        int i = Arrays.binarySearch(arr, 10);
        System.out.println(i);

        //copyOf(原数组，新数组的长度):拷贝数组
        //参数一：老数组
        //参数二：新数组的长度
        //方法的底层会根据第二个参数来创建新的数组
        //如果新数组的长度是小于老数组的长度，会部分拷贝
        //如果新数组的长度是等于老数组的长度，会完全拷贝
        //如果新数组的长度是大于老数组的长度，会补上数组类型默认值
        System.out.println("-----------------copyOf(原数组，新数组的长度)-----------------");
        int[] copyOf1 = Arrays.copyOf(arr, 10);
        System.out.println(Arrays.toString(copyOf1));

        //copyOfRange(原数组，起始索引，结束索引):拷贝数组(指定范围)
        //细节：包头不包尾，包左不包右  [index1, index2)
        System.out.println("-----------------copyOfRange(原数组，起始索引，结束索引)-----------------");
        int[] copyOf2 = Arrays.copyOfRange(arr,0,5);
        System.out.println(Arrays.toString(copyOf2));

        //fill(数组，元素):填充数组
        System.out.println("-----------------fill(数组，元素)-----------------");
        Arrays.fill(copyOf1, 99);
        System.out.println(Arrays.toString(copyOf1));

        //sort(数组):按照默认的方式进行数组排序
        //默认情况下，给基本数据类型进行升序排序，底层使用的是快速排序
        System.out.println("-----------------sort(数组)-----------------");
        int[] arr2 = {10, 2, 3, 5, 6, 1, 7, 8, 4, 9};
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));


    }
}
