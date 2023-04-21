package com.rockstar.jdk8data.zoneld;

import java.time.ZoneId;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        /*
        *   static Set<String> getAvailableZoneIds()        获取Java中支持的所有时区
        *   static ZoneId systemDefault()                   获取系统默认时区
        *   static ZoneId of(String zoneId)                 获取一个指定时区
        * */

        //1、
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds.size());//602
        System.out.println(zoneIds);// America/Cuiaba

        //2、
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);//Asia/Taipei

        //3、
        ZoneId zoneId1 = ZoneId.of("America/Cuiaba");
        System.out.println(zoneId1);
    }
}
