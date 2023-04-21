package com.rockstar.jiekou.demo1;

public class TuZi extends Anamal{
    @Override
    public void eat() {
        System.out.println("兔子吃胡萝卜");
    }

    public TuZi() {
    }

    public TuZi(String name, int age) {
        super(name, age);
    }
}
