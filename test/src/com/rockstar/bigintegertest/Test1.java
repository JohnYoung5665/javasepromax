package com.rockstar.bigintegertest;

import java.math.BigInteger;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
//        public BigInteger(int num, Random rnd) 		//获取随机大整数，范围：[0 ~ 2的num次方-1]
//        public BigInteger(String val) 				//获取指定的大整数
//        public BigInteger(String val, int radix) 	//获取指定进制的大整数
//
//        下面这个不是构造，而是一个静态方法获取BigInteger对象
//        public static BigInteger valueOf(long val) 	//静态方法获取BigInteger的对象，内部有优化

        //1.获取一个随机的大整数
//        Random r = new Random();
//        for (int i = 1; i < 100;i++) {
//            BigInteger bd1 = new BigInteger(4,r);
//            System.out.println(bd1);
//        }

        //2.获取一个指定的大整数，可以超出long的取值范围
        BigInteger bd2 = new BigInteger("999999999999999999999999999999999");
        System.out.println(bd2);

        //3.获取指定进制的大整数
        //1.字符串中的数字必须是整数
        //2.字符串中的数字必须要跟进制吻合。
        //比如二进制中，那么只能写日和1，写其他的就报错。
        BigInteger bd3 = new BigInteger("10100",2);
        System.out.println(bd3);

        BigInteger bd4 = BigInteger.valueOf(17);
        BigInteger bd5 = BigInteger.valueOf(17);
        System.out.println(bd4 == bd5);


    }
}
