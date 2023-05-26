package com.zidingyi.day21demo;

public class demo4 {
    public static void main(String[] args) {
        /*
            小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶。
            如果这个楼梯有20个台阶，小明一共有多少种爬法呢？
         */

        System.out.println(getCount(20));
    }

    private static int getCount(int number) {
        if (number == 1){
            return 1;
        }
        if (number == 2){
            return 2;
        }
        return getCount(number - 1) + getCount(number - 2);
    }
}
