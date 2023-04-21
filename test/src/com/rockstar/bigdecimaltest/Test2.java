package com.rockstar.bigdecimaltest;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test2 {
    public static void main(String[] args) {
//        BigDecimal divide(BigDecimal divisor, int scale, int roundingMode)
//        divisor:			除数对应的BigDecimal对象；
//        scale:				精确的位数；
//        roundingMode:		取舍模式；
//        取舍模式被封装到了RoundingMode这个枚举类中（关于枚举我们后期再做重点讲解），在这个枚举类中定义了很多种取舍方式。最常见的取舍方式有如下几个：
//        UP(直接进1) ， FLOOR(直接删除) ， HALF_UP(4舍五入),我们可以通过如下格式直接访问这些取舍模式：枚举类名.变量名
        BigDecimal bd1 = new BigDecimal("0.3");
        BigDecimal bd2 = new BigDecimal("4");
        System.out.println(bd1.divide(bd2, 2, RoundingMode.HALF_UP));
    }
}
