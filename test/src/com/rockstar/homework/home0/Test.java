package com.rockstar.homework.home0;

public class Test {
    public static void main(String[] args) {
        Round r = new Round(5);
        System.out.println("圆的面积为：" + r.area());
        System.out.println("圆的周长为：" + r.perimeter());

        Rectangle r1 = new Rectangle(10,5);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());


    }
}
