package com.rockstar.jiekou.demo1;

public class QingWa extends Anamal implements Swim{
    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("蛙泳");
    }

    public QingWa() {
    }

    public QingWa(String name, int age) {
        super(name, age);
    }
}
