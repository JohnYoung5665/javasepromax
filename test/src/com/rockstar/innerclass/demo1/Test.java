package com.rockstar.innerclass.demo1;

public class Test {
    public static void main(String[] args) {
        new ZZ(){
            @Override
            public void show() {
                System.out.println("匿名内部类1方法调用");
            }
        }.show();

        Inter i = new Inter(){
            @Override
            public void show1() {
                System.out.println("匿名内部类2方法调用");
            }
        };
        i.show1();
    }
}
