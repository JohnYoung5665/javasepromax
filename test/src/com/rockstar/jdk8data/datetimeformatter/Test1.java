package com.rockstar.jdk8data.datetimeformatter;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Test1 {
    public static void main(String[] args) {
        /*
            static DateTimeFormatter ofPattern(格式) 获取格式对象
            String format(时间对象) 按照指定方式格式化
        */
        //获取时间对象
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));

        //解析/格式化器
        DateTimeFormatter time1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE");

        //格式化
        String format = time1.format(time);
        System.out.println(format);
    }
}
