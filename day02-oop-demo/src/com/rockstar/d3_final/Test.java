package com.rockstar.d3_final;

public class Test {
    public static void main(String[] args) {
        // 目标：记住final的语法。
        // 1、final修饰类，类不能被继承。
        // 2、final修饰方法，方法不能被重写
        // 3、final修饰变量，总规则：变量有且仅能被赋值一次。
    }
}

class Student extends People{
//    @Override
//    public void eat() {
//        System.out.println("学生吃的很多~~");
//    }
}

class People{
    public final void eat(){
        System.out.println("人都要吃东西~~");
    }
}


//class Wolf extends Animal{
//}
//
//final class Animal{
//}

