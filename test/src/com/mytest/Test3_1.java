package com.mytest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test3_1 {
    public static void main(String[] args) {
        //创建学生集合
        ArrayList<String> list1 = new ArrayList<>();
        //添加元素
        Collections.addAll(list1,"张旭","关和","李星光","呼笑","刘学","娃子","埃隆马斯克","高琴","桃乃木香奈","郑博云","杨转移");

        //创建第二个集合用于存储被删除的元素
        ArrayList<String> list2 = new ArrayList<>();

        Random r = new Random();

        //外循环：表示点名10轮
        for (int i = 1; i <= 10; i++) {
            System.out.println("=========第"+i+"轮点名开始了============");
            //先获取学生集合的长度，便于可以获取到集合中每一个元素
            int size = list1.size();
            //内循环：根据学生集合的长度
            for (int j = 0; j < size; j++) {
                //随机生成索引
                int index = r.nextInt(list1.size());
                //删除学生集合指定索引的元素
                //利用返回被删除元素的值，进行输出名字和添加到第二个集合
                String name = list1.remove(index);
                //把当前抽取出来的名字添加到list2中
                list2.add(name);
                System.out.println(name);
            }
            //一轮循环结束，此时学生集合中每一个元素已经被删除，是一个空集合
            //但是list2里面已经存储了每一个被删除的元素
            //需求是循环10次，需要把list2中的名字重新添加到学生集合当中，便于后续点名
            list1.addAll(list2);
            //因为list2需要再下一轮再次进行添加被删除的元素，所以需要清空
            list2.clear();
        }
    }
}
