package com.rockstar.jiekou.demo3;

public abstract class Coach extends Sports{
    public abstract void teach();

    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }
}
