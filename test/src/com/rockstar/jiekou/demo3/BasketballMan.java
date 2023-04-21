package com.rockstar.jiekou.demo3;

public class BasketballMan extends SportsMan{

    @Override
    public void study() {
        System.out.println("学习打篮球");
    }

    public BasketballMan() {
    }

    public BasketballMan(String name, int age) {
        super(name, age);
    }
}
