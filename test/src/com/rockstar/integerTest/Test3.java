package com.rockstar.integerTest;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        /*

            定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制

         */
        int num = 6;//01100100
        int number = num;
        List<Integer> remaindar = new ArrayList<>();
        while (true){
            if (number == 0){
                break;
            }
            remaindar.add(number % 2);
            number = number / 2;
        }
        for (int i = remaindar.size() - 1; i >= 0; i--) {
            System.out.print(remaindar.get(i));
        }
        System.out.println();
        System.out.println(tobinarystring(6));
    }

    public static String tobinarystring(int number) {//6
        //核心逻辑:
        //不断的去除以2，得到余数，一直到商为日就结束。
        //还需要把余数倒着拼接起来

        //定义一个StringBuilder用来拼接余数
        StringBuilder sb = new StringBuilder();
        //利用循环不断的除以2获取余数
        while (true) {
            if (number == 0) {
                break;
            }
            //获取余数 %
            int remaindar = number % 2;//倒着拼接
            sb.insert(0, remaindar);
            //除以2 /
            number = number / 2;
        }
        return sb.toString();
    }
}
