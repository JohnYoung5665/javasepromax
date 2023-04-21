package com.mygenerics.homework;

public class Huskies extends Dog{
    public Huskies() {
    }


    @Override
    public void eat() {
        System.out.println("一只叫做"+this.getName()+"的，"+this.getAge()+"岁的哈士奇，正在吃骨头，边吃边拆家~");
    }


}
