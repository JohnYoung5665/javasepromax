package com.rockstar.homework.home5;

public class Test {
    public static void main(String[] args) {
        B b = new B(new InterB() {
            @Override
            public void showB() {
                System.out.println("showB");
            }
        });
        b.methodB();
    }
}
