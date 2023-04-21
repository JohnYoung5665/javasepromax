package com.rockstar.datetest.simpledateformattest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo2 {
    public static void main(String[] args) throws ParseException {
        /*
            秒杀开始时间：2023年11月11日 0:0:0
            秒杀结束时间：2023年11月11日 0:10:0
        */
        //需求：
        //小贾下单并付款的时间为：2023年11月11日 0:01:00
        //小皮下单并付款的时间为：2023年11月11日 0:11:0
        //用代码说明这两位同学有没有参加上秒杀活动

        String startStr = "2023年11月11日 00:00:00";
        long startTime = jieXi(startStr);
        System.out.println(startTime);

        String endStr = "2023年11月11日 00:10:00";
        long endTime = jieXi(endStr);
        System.out.println(endTime);

        //小贾
        String smallJiaStr = "2023年11月11日 00:01:00";
        long timeJia = jieXi(smallJiaStr);
        System.out.println(timeJia);


        String smallPiStr = "2023年11月11日 00:11:00";
        long timePi = jieXi(smallPiStr);
        System.out.println(timePi);

        //判断
        //小贾
        boolean b1 = miaoSha(startTime, endTime, timeJia);
        System.out.println("小贾" + b1);
        //小皮
        boolean b2 = miaoSha(startTime, endTime, timePi);
        System.out.println("小皮" + b2);

    }

    public static boolean miaoSha(long startTime, long endTime, long time){
        if (time > endTime || time < startTime){
            return false;
        }
        return true;
    }
    public static long jieXi(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = sdf.parse(str);
        return date.getTime();
    }
}
