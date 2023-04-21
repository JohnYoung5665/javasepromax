package com.rockstar.integerTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        /*请使用代码计算你活了多少天，用JDK7和JDK8两种方式完成*/

        //JDK7
        //规则：只要对时间进行计算或者判断，都需要先获取当前时间的毫秒值
        //1、计算出生年月日的毫秒值
//        String birthday = "2000-1-1";
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = sdf.parse(birthday);
//        long birthdayTime = date.getTime();
//        //获取当前时间的毫秒值
//        long todayTime = System.currentTimeMillis();
//        //3、计算间隔多少天
//        long time = todayTime - birthdayTime;
//        System.out.println(time / 1000 / 60 / 60 / 24);


        //JDK8+
        //当前时间
        LocalDate today = LocalDate.now();
        System.out.println(today);


        //出生年月
        LocalDate birthday = LocalDate.of(2001,7,24);
        System.out.println(birthday);

        long days = ChronoUnit.DAYS.between(birthday, today);
        System.out.println(days);


    }
}
