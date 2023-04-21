package com.rockstar.extendsTest;

public class Dog {

    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat(){
        System.out.println("吃狗粮");
    }

    public void drink(){
        System.out.println("喝水");
    }

    public void lookHome(){
        System.out.println("看家");
    }
}
