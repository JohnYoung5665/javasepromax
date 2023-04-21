package com.rockstar.datetest;

import java.util.Date;

public class Test1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();
        date.setTime(time + 1000L * 60 * 60 * 24 * 365);
        System.out.println(date);
        System.out.println("==================");

        //2、创建对象表示一个指定的时间
        Date d2 = new Date(0L);
        System.out.println(d2);

        //3、setTime 修改时间
        //1000毫秒 = 1秒
        d2.setTime(1000L);
        System.out.println(d2);
        d2.setTime(2000L);
        System.out.println(d2);

        //4、getTime获取当前时间的毫秒值
        long time1 = d2.getTime();
        System.out.println(time1);


        Date d3 = new Date(1000L);
        System.out.println(d3);

    }
}
