package com.rockstar.homework;

public class Animal {
    private String color;
    private int numOfLegs;


    public void eat(String eatfoods){
        System.out.println("吃"+eatfoods);
    }

    public Animal() {
    }

    public Animal(String color, int tui) {
        this.color = color;
        this.numOfLegs = tui;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTui() {
        return numOfLegs;
    }

    public void setTui(int tui) {
        this.numOfLegs = tui;
    }
}
