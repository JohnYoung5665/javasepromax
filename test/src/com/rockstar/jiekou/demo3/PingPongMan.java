package com.rockstar.jiekou.demo3;

public class PingPongMan extends SportsMan implements English{
    @Override
    public void StudyEnglish() {
        System.out.println("乒乓球运动员学习英语");
    }

    @Override
    public void study() {
        System.out.println("学习打乒乓球");
    }

    public PingPongMan() {
    }

    public PingPongMan(String name, int age) {
        super(name, age);
    }
}
