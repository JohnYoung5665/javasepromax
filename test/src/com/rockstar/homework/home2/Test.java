package com.rockstar.homework.home2;

public class Test {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.playGame();

        new IPlay(){
            @Override
            public void playGame() {
                System.out.println("测试类匿名内部类玩游戏");
            }
        }.playGame();

        System.out.println("==========================");

        Zx z = new Zx();
        z.fun();

        new Fun(){
            @Override
            public void fun() {
                System.out.println("测试类匿名内部类方法执行");
            }
        }.fun();
    }
}
