package com.rockstar.d3_final;

public class Test2 {

    /**
        二：修饰静态成员变量(public static final修饰的也称为常量了)
     */
    public static final String schoolName = "黑马";

    /**
       三，修饰实例成员变量。（几乎不用）
     */
    private final String name = "猪刚鬣";

    public static void main(String[] args) {
        // 目标：理解final修饰变量的作用：总规则：变量有且仅能被赋值一次。（理解语法）
        // 变量有几种：
        //    1、局部变量
        //    2、成员变量
        //           -- 实例成员变量。
        //           -- 静态成员变量。

        // 一：修饰局部变量
        final double rate = 3.14;
        // rate = 3.19; // 第二次赋值了。
        buy(0.8);

        // schoolName = "黑马程序员"; // 第二次赋值了。

        Test2 t = new Test2();
        System.out.println(t.name);
        // t.name = "天蓬元帅";

        // 注意：final修饰引用类型的变量，其地址值不能改变，但是指向的对象的内容可以改变的。
        final Teacher t2 = new Teacher("学习，授课，吹吹水~~");
        // t2 = null;  // 第二次赋值了。
        System.out.println(t2.getHobby());
        t2.setHobby("运动");
        System.out.println(t2.getHobby());
    }

    public static void buy(final double z){
         // z = 0.1; // 第二次赋值了。
    }
}

class Teacher{
    private String hobby;

    public Teacher(String hobby) {
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
