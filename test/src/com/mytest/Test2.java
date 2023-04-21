package com.mytest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test2 {
    public static void main(String[] args) {
        /* 班级里有N个学生
        要求：
        70%的概率随机到男生
        30%的概率随机到女生

        "范闲","范建","范统","杜子腾","宋合泛","侯笼藤","朱益群","朱穆朗玛峰",
        "杜琦燕","袁明媛","李猜","田蜜蜜",
        */

        //1.创建集合，概率
        ArrayList<Integer> list = new ArrayList<>();
        //2.添加数据
        Collections.addAll(list,1,1,1,1,1,1,1,0,0,0);
        //3.打乱数组中的数据
        Collections.shuffle(list);
        //4.从list集合中随机抽取0或者1
        Random r = new Random();
        int index = r.nextInt(list.size());
        Integer number = list.get(index);

        //5.创建两个集合分别存储男生和女生的名字
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        Collections.addAll(boyList,"张旭","关和","李星光","呼笑","刘学","娃子","埃隆马斯克");
        Collections.addAll(girlList,"高琴","桃乃木香奈","郑博云","杨转移");

        if (number == 1){
            Collections.shuffle(boyList);
            int index1 = r.nextInt(boyList.size());
            String name1 = boyList.get(index1);
            System.out.println(name1);
        }else {
            Collections.shuffle(girlList);
            int index2 = r.nextInt(girlList.size());
            String name2 = girlList.get(index2);
            System.out.println(name2);
        }



    }
}
