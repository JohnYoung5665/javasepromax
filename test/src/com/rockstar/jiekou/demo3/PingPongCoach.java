package com.rockstar.jiekou.demo3;

public class PingPongCoach extends Coach implements English{
    @Override
    public void teach() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void StudyEnglish() {
        System.out.println("乒乓球教练学习英语");
    }

    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }
}
