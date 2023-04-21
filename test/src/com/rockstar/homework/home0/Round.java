package com.rockstar.homework.home0;

public class Round extends Shape {
    private static final double PI = 3.1415926535;
    private double radius;

    public Round(double radius) {
        this.radius = radius;
    }

    public Round() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        //π*r的平方 = 面积
        return radius * radius * PI;
    }

    @Override
    public double perimeter() {
        //圆周= 2πr
        return 2 * PI * radius;
    }

}
