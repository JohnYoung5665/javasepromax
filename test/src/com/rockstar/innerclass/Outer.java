package com.rockstar.innerclass;

public class Outer {
    private int a = 10;

    class Inner{
        private int a = 20;

        public void show(){
            int a = 30;
            System.out.println(Outer.this.a);
            System.out.println(this.a);
            System.out.println(a);
        }

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
