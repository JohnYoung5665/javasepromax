package com.mytest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test3 {


    public static ArrayList<String> list = new ArrayList<>();
    public static ArrayList<String> list2 = new ArrayList<>();

    
    public static void main(String[] args) {
        /* 班级里有N个学生
            要求：
            被点到的学生不会再被点到。
            但是如果班级中所有的学生都点完了，需要重新开启第二轮点名。
        */

        Collections.addAll(list,"张旭","关和","李星光","呼笑","刘学","娃子","埃隆马斯克","高琴","桃乃木香奈","郑博云","杨转移");

        String name = null;

        while (true) {
            //判断班级中的所有学生是否全部点过了
            if (list.equals(list2)){
                //true表示全部点完了，重新开始点名
                System.out.println("花名册已全部点完");
                break;
            }
            //打乱班级表
            Collections.shuffle(list);
            //随机抽取班级花名册索引
            Random r = new Random();
            int index = r.nextInt(list.size());
            name = list.get(index);
            //查询当前抽取出来的名字是否已经点过了
            if (!checkList(name)){
                //false表示当前的名字没点过
                list2.add(name);
                System.out.println(name);
            }
            //如果if判断没执行，表示当前名字已经点过，需要重新抽取
        }
    }
    public static boolean checkList(String name){
        //遍历list2集合
        //获取集合中每一个元素
        for (String s : list2) {
            //拿着每一个元素和抽取出的名字做判断
            if (s.equals(name)){
                //true表示重复
                return true;
            }
        }
        //循环结束，还没有找到，就表示没有重复
        //返回false
        return false;
    }
}
