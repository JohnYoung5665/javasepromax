package com.mygenerics.homework;

public class Teddy extends Dog{
    public Teddy() {
    }


    @Override
    public void eat() {
        System.out.println("一只叫做"+this.getName()+"的，"+this.getAge()+"岁的泰迪，正在吃骨头，边吃边蹭~");
    }


}
