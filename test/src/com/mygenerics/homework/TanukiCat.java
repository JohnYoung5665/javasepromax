package com.mygenerics.homework;

public class TanukiCat extends Cat{
    public TanukiCat() {
    }



    @Override
    public void eat() {
        System.out.println("一只叫做"+this.getName()+"的，"+this.getAge()+"岁的狸花猫，正在吃鱼~");
    }


}
