package com.rockstar.runtimedemo;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        //1、获取Runtime的对象
//        Runtime r = Runtime.getRuntime();

        //2、exit 停止虚拟机
//        Runtime.getRuntime().exit(0);

        //3、获取CPU的线程数
//        System.out.println(Runtime.getRuntime().availableProcessors());

        //4、JVM能从系统中获取总内存大小（单位byte）
//        System.out.println(Runtime.getRuntime().maxMemory() / 1024 / 1024);

        //5、JVM已经从系统中获取总内存的大小
//        System.out.println(Runtime.getRuntime().totalMemory() / 1024 / 1024);

        //6、JVM剩余内存的大小
//        System.out.println(Runtime.getRuntime().freeMemory() / 1024 / 1024);

        //7、运行cmd命令
        Runtime.getRuntime().exec("shutdown -a");
    }

}
