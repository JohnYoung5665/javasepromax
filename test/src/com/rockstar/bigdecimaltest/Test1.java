package com.rockstar.bigdecimaltest;

import java.math.BigDecimal;

public class Test1 {
    public static void main(String[] args) {
        //  public BigDecimal(int val)  将int转换为BigDecimal类型
        //  public BigDecimal(long val) 将long转换为BigDecimal
        //  public BigDecimal(String val) 将String转换为BigDecimal

        //1
        BigDecimal bd1 = new BigDecimal(10);
        System.out.println(bd1);
        //2
        BigDecimal bd2 = new BigDecimal(123456L);
        System.out.println(bd2);
        //3
        BigDecimal bd3 = new BigDecimal("4");
        BigDecimal bd4 = new BigDecimal("0.3");

//        public BigDecimal add(BigDecimal value)				// 加法运算
        System.out.println(bd1.add(bd2));
        System.out.println(bd1);
        System.out.println(bd2);

//        public BigDecimal subtract(BigDecimal value)		    // 减法运算

//        public BigDecimal multiply(BigDecimal value)		    // 乘法运算
//        public BigDecimal divide(BigDecimal value)			// 触发运算


    }
}
