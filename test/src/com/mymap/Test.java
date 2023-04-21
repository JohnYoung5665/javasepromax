package com.mymap;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        /*
            某个班级80名学生，现在需要组成秋游活动，
            班长提供了四个景点依次是（A、B、C、D）,
            每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
        */
        String[] arr = {"A", "B","C","D"};
        Random r = new Random();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(arr.length);
            list.add(arr[index]);
        }

        //创建Map集合记录每个景点的投票次数
        HashMap<String, Integer> hm = new HashMap<>();
        //遍历list集合
        for (String name : list) {
            //判断当前景点再map集合中是否存在
            if (hm.containsKey(name)){
                //如果存在，再原有的投票基础上再加1票
                Integer sount = hm.get(name);
                hm.put(name, sount + 1);
            }else {
                //如果不存在，代表当前景点第一次投票
                hm.put(name, 1);
            }
        }
        System.out.println(hm);

        //判断最大值
        int max = 0;
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            //得到每一个景点的投票次数
            Integer value = entry.getValue();
            if (value > max){
                max = value;
            }
        }

        System.out.println(max);

        //判断一样的票数
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() == max){
                System.out.println(entry.getKey());
            }
        }

    }
}
