package com.rockstar.objectdemo;

import com.google.gson.Gson;

import java.util.Arrays;
import java.util.Date;

public class Test {
    //public String toString()				//返回该对象的字符串表示形式(可以看做是对象的内存地址值)
    //public boolean equals(Object obj)		//比较两个对象地址值是否相等；true表示相同，false表示不相同
    //protected Object clone()    			//对象克隆
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 0};
        User u1 = new User(1,"张旭","zx123456","girl11", data);
        System.out.println(u1);

//        User u2 = (User) u1.clone();
//
//        System.out.println(u2);
//
//        System.out.println("============================");
//        int[] arr = u2.getData();
//        arr[0] = 99;
//        System.out.println(u1);
//        System.out.println(u2);
//
//        System.out.println("============================");
        //第三方工具
        //1、第三方工具的代码导入到项目中
        //2、编写代码
        Gson gson = new Gson();
        //把对象变成一个字符串
        String s = gson.toJson(u1);
        //再把字符串变回对象就可以了
        User u2 = gson.fromJson(s, User.class);
        //打印对象
        int[] arr = u2.getData();
        arr[0] = 99;

        System.out.println(u2);


    }
}
