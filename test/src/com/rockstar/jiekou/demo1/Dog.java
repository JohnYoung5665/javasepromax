package com.rockstar.jiekou.demo1;

public class Dog extends Anamal implements Swim {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗刨");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}
