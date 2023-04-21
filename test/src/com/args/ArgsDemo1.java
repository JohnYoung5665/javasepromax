package com.args;

public class ArgsDemo1 {
    public static void main(String[] args) {

    }

    //一次只能添加一个可变参数
    //如果方法形参中除了可变参数还要添加其他参数，，
    //可变参数必须写在第一位
    public static int getSum(int a, int...args){
        return 0;
    }
}
