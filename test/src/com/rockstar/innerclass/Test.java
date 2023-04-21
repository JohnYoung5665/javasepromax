package com.rockstar.innerclass;

public class Test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();

        oi.show();
    }
}
