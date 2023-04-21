package com.rockstar.homework.home4;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.methodA(new InterA() {
            @Override
            public void showA() {

            }
        });


    }
}
