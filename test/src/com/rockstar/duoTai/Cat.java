package com.rockstar.duoTai;

public class Cat extends Animal {
    @Override
    public void eat(String something){
        System.out.println(getAge()+"岁的"+getColor()+"颜色的猫侧着头吃"+something);
    }

    public void catchMouse(){
        System.out.println("逮老鼠");
    }

    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);
    }
}
