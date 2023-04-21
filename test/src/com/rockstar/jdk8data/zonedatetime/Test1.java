package com.rockstar.jdk8data.zonedatetime;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test1 {
    public static void main(String[] args) {
        /*
            static ZonedDateTime now() 获取当前时间的ZonedDateTime对象
            static ZonedDateTime ofXxxx(。。。) 获取指定时间的ZonedDateTime对象
            ZonedDateTime withXxx(时间) 修改时间系列的方法
            ZonedDateTime minusXxx(时间) 减少时间系列的方法
            ZonedDateTime plusXxx(时间) 增加时间系列的方法
         */
        //1、获取当前时间对象（带时区）
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        //2、获取指定时间对象（带时区）
        //年月日时分秒纳秒方式指定
        ZonedDateTime time1 = ZonedDateTime.of(2001, 7, 24,
                                                12, 25, 33,
                                                0, ZoneId.of("Asia/Shanghai"));
        System.out.println(time1);

        //通Instant + 时区的方式指定获取时间对象
//        Instant instant = Instant.ofEpochMilli(0L);
//        ZoneId zoneId = ZoneId.of("Asia/Taipei");
//        ZonedDateTime time2 = ZonedDateTime.of(instant, zoneId);
//        System.out.println(time2);

        //3.withXxx 修改时间系列的方法
        ZonedDateTime time3 = time1.withDayOfMonth(30);
        System.out.println(time3);

        //4. 减少时间
        ZonedDateTime time4 = time3.minusYears(1);
        System.out.println(time4);

        //5.增加时间
        ZonedDateTime time5 = time4.plusYears(10);
        System.out.println(time5);
    }
}
