package com.rockstar.a06bigintegerdemo;

import java.math.BigInteger;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        /*
            public BigInteger(int num, Random rnd) 获取随机大整数，范围:[0~ 2的num次方-11
            public BigInteger(String val) 获取指定的大整数
            public BigInteger(String val, int radix) 获取指定进制的大整数

            public static BigInteger valueOf(long val) 静态方法获取BigInteger的对象，内部有优化

            细节:
            对象一旦创建里面的数据不能发生改变。
        */

        //1、获取一个随机的大整数
        Random r = new Random();
        BigInteger bd1 = new BigInteger(4,r);//[0 ~ 15]
        System.out.println(bd1);

        //2、获取一个指定的大整数，可以超出long的取值范围
        //细节：字符串中必须是整数，否则会报错
        BigInteger bd2 = new BigInteger("99999999999999999999");
        System.out.println(bd2);

        //3、获取指定进制的大整数
        //细节：
        //1、字符串中的数字必须是整数
        //2、字符串中的数字必须要跟进制吻合
        //比如二进制中，那么只能写0和1，写其他的就报错
        BigInteger bd3 = new BigInteger("01",2);
        System.out.println(bd3);

        //4、静态方法获取BigInteger的对象，内部有优化
        //细节：
        //1、能表示范围比较小，只能在long的取值范围之内，如果超出long的范围就不行了
        //2、在内部对常用的数字：-16 ~ 16 进行了优化
        // 提前把 -16 ~ 16 先创建好BigInteger的对象，如果多次获取不会重新创建新的。
        BigInteger bd4 = BigInteger.valueOf(17);
        BigInteger bd5 = BigInteger.valueOf(17);
        System.out.println(bd4 == bd5);

        //5、对象一旦创建内部的数据不能发生改变
        BigInteger bd6 = BigInteger.valueOf(1);
        BigInteger bd7 = BigInteger.valueOf(2);
        BigInteger result = bd6.add(bd7);
        System.out.println(bd6);
        System.out.println(result);
    }
}
