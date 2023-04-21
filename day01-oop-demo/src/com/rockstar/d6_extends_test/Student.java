package com.rockstar.d6_extends_test;
/**
   子类
 */
public class Student extends People {

    /**
     独有的行为。填写反馈信息。
     */
    public void writeInfo(){
        System.out.println(getName() + "写下了：学习语法，好哈皮~~");
    }

}
