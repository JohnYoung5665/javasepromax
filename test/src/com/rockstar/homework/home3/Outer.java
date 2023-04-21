package com.rockstar.homework.home3;

public class Outer {

//    static Inter method() {
//        return new Inter() {
//            @Override
//            public void show() {
//                System.out.println("Hello from Inter");
//            }
//        };
//    }

    public static Inter method(){
        return new Inter(){
            @Override
            public void show() {

            }
        };
    }

}
