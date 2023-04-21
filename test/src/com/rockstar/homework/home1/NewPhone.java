package com.rockstar.homework.home1;

public class NewPhone extends Phone implements Play{
    @Override
    public void call() {
        System.out.println("新手机打电话");
    }

    @Override
    public void message() {
        System.out.println("新手机发短信");
    }

    @Override
    public void playGame() {
        System.out.println("新手机打游戏");
    }
}
