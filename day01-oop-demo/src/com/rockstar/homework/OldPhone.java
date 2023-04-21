package com.rockstar.homework;

public class OldPhone {
    private String brand;
    private double price;

    public void show(){
        System.out.println("显示手机号!");
    }

    public void call(String name){
        System.out.println("给"+name+"打电话");
    }

    public void message(){
        System.out.println("发短信");
    }

    public OldPhone() {
    }

    public OldPhone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
