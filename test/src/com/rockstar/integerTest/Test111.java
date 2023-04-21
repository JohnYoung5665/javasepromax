package com.rockstar.integerTest;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Test111 {
    public static void main(String[] args) {
        /*
            键盘录入一些1~100之间的整数，并添加到集合中。
            直到集合中所有数据和超过200为止.
        */
        Scanner sc = new Scanner(System.in);

        //创建ArrayList集合 泛型<Integer> 用于存储用户输入的整数
        ArrayList<Integer> list = new ArrayList<>();
        //创建sum累加集合中每个索引的数据
        int sum = 0;
        while (true){
            System.out.println("请输入1~100之间的整数：");
            String str = sc.nextLine();
            int number = Integer.parseInt(str);
            if (number < 1 || number > 100){
                continue;
            }
            list.add(number);
            sum += number;
            if (sum > 200){
                break;
            }
        }








        //循环，如果sum总和大于200，循环结束
//        for (int i = 0; sum <= 200; i++) {
//            System.out.println("请输入1~100之间的整数：");
//            //接收输入的整数，转为String类型
//            String str = sc.nextLine();
//            //添加到list集合中,String类型转换为Integer类型
//            //用static静态方法valueOf()获取Integer对象(-128~127:节省内存,不用每次都创建对象)
//            //把String类型转为Integer类型存入集合
//            list.add(Integer.valueOf(str));
//            //累加集合每一个索引数据
        //      自动拆箱
//            sum += list.get(i);
//        }
//        System.out.println(sum);


    }
}
