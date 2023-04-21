package com.rockstar.homework.home0;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area() {
        //长乘宽
        return length * width;
    }

    @Override
    public double perimeter() {
        //( 長+寬)×2
        return (length + width) * 2;
    }

}
