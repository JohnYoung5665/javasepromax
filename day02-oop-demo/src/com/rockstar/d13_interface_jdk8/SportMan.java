package com.rockstar.d13_interface_jdk8;

public interface SportMan {

    /**
       1、默认方法：其实就是实例方法。
           -- 必须用default修饰，默认会自带public
           -- 必须用接口的实现类的对象来调用
     */
    default void run(){
        go();
        System.out.println("==跑的贼溜==");
    }

    /**
      2、静态方法
            -- 必须static修饰，默认会自带public
            -- 必须用接口名自己调用
     */
    static void inAddr(){
        System.out.println("我们在黑马");
    }

    /**
      3、私有实例方法：
           -- 必须用private修饰
           -- 只能本接口中访问。
           -- 一般给接口中其他的默认方法或者私有实例方法使用的
     */
    private void go(){
        System.out.println("开始跑~~");
    }
}
