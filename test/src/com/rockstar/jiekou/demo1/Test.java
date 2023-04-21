package com.rockstar.jiekou.demo1;

public class Test {
    public static void main(String[] args) {
        TuZi t = new TuZi();
        t.eat();

        System.out.println("============================");

        Dog d = new Dog();
        d.eat();
        d.swim();

        System.out.println("============================");

        QingWa q = new QingWa();
        q.eat();
        q.swim();
    }
}
