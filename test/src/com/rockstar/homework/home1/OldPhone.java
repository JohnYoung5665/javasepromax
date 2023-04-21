package com.rockstar.homework.home1;

public class OldPhone extends Phone {
    @Override
    public void call() {
        System.out.println("旧手机打电话");
    }

    @Override
    public void message() {
        System.out.println("旧手机发短信");
    }
}
