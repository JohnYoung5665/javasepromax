package com.mytest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        /* 班级里有N个学生，学生属性:姓名，年龄，性别。
        实现随机点名器。*/

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张旭","关和","李星光","呼笑","刘学","娃子","埃隆马斯克","高琴","桃乃木香奈","郑博云","杨转移");

        Random r = new Random();
        int index = r.nextInt(list.size());
        String name = list.get(index);
        System.out.println(name);

        //方式2：打乱集合元素
        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
