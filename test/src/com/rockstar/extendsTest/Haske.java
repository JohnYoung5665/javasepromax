package com.rockstar.extendsTest;

public class Haske extends Dog {
    public void chaiHome(){
        System.out.println("拆家");
    }

    public Haske() {
    }

    public Haske(String name, int age) {
        super(name, age);
    }
}
