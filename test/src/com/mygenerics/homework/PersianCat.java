package com.mygenerics.homework;

public class PersianCat extends Cat{
    public PersianCat() {
    }



    @Override
    public void eat() {
        System.out.println("一只叫做"+this.getName()+"的，"+this.getAge()+"岁的波斯猫，正在吃小饼干~");
    }


}
