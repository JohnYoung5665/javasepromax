package com.mymap;

import java.util.*;

public class HashMapDemo2 {
    public static void main(String[] args) {
        /*
            某个班级80名学生，现在需要组成秋游活动，
            班长提供了四个景点依次是（A、B、C、D）,
            每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
        */

        //1.需要先让同学们投票
        //定义一个数组，存储4个景点
        String[] arr = {"A","B","C","D"};
        //利用随机数模拟80个同学的投票，并把投票的结果存储起来
        ArrayList<String> list = new ArrayList<>();
        Random r = new Random();
        //循环80次模拟投票80次
        for (int i = 0; i < 80; i++) {
            //随机生成0~3arr数组的索引，每个数字代表索引相对应的元素（景点）
            int index = r.nextInt(arr.length);
            //利用随机获得的索引，把arr数组中的指定索引处的景点添加到list集合中
            list.add(arr[index]);
        }

        //2.如果要统计的东西比较多，不方便使用计数器思想
        //我们可以定义Map集合，利用集合进行统计。
        HashMap<String,Integer> hm = new HashMap<>();
        //遍历list集合，把投票结果添加到map集合中
        for (String name : list) {
            //判断当前的景点在map集合当中是否存在
            if (hm.containsKey(name)){
                //如果存在，就要在该景点原有的投票次数上再加1票
                //先获取当前景点已经被投票的次数
                Integer count = hm.get(name);
                //表示当前景点又被投了一次
                hm.put(name,count + 1);
            }else {
                //如果不存在，就是该景点第一次添加，投票次数默认为1
                hm.put(name,1);
            }
        }

        //3.求最大值
        int max = 0;
        //利用entrySet()方法得到Map集合所有的键值对对象
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        //键值对对象进行遍历
        for (Map.Entry<String, Integer> entry : entries) {
            //记录每个景点的投票次数
            int count = entry.getValue();
            //再拿投票次数跟最大值比较
            if (count > max){
                max = count;
            }
        }

        System.out.println(max);

        //4.判断哪个景点的次数跟最大值一样，如果一样，打印出来
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() == max){
                System.out.println(entry.getKey());
            }
        }


        System.out.println(hm);
    }
}
