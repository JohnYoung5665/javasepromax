package com.rockstar.homework;

public class NewPhone extends OldPhone {

    @Override
    public void show(){
        super.show();
        System.out.println("显示头像");
        System.out.println("显示归属地");
    }

    public void playGame(){
        System.out.println("打战地5");
    }
}
