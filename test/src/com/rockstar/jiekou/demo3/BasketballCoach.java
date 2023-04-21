package com.rockstar.jiekou.demo3;

public class BasketballCoach extends Coach{
    @Override
    public void teach() {
        System.out.println("教打篮球");
    }

    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }
}
