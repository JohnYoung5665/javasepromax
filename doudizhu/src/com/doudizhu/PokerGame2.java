package com.doudizhu;

import java.util.*;

public class PokerGame2 {

    //牌盒Map
    //此时我们只要把牌跟序号产生对应关系就可以了，不需要按照序号进行排序，所以只要HashMap就行了
    static HashMap<Integer, String> hm = new HashMap<>();
    static ArrayList<Integer> list = new ArrayList<>();

    static {
        //准备牌
        String[] color = {"♦","♣","♥","♠"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        Integer serialNumber = 1;
        for (String n : number) {
            for (String c : color) {
                hm.put(serialNumber, c + n);
                list.add(serialNumber);
                serialNumber++;
            }
        }
        hm.put(serialNumber, "小王");
        list.add(serialNumber);
        serialNumber++;
        hm.put(serialNumber, "大王");
        list.add(serialNumber);
    }

    public PokerGame2(){
        //洗牌
        Collections.shuffle(list);

        //发牌
        TreeSet<Integer> lord = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            //i:依次表示集合中的每一个索引
            //list.get(i)元素：牌的序号
            int serialNumber = list.get(i);

            if (i <= 2){
                lord.add(serialNumber);
                continue;
            }

            if (i % 3 == 0){
                player1.add(serialNumber);
            }else if (i % 3 == 1){
                player2.add(serialNumber);
            }else {
                player3.add(serialNumber);
            }

        }

        //看牌
        lookPoker("底牌",lord);
        lookPoker("张旭",player1);
        lookPoker("埃隆马斯克",player2);
        lookPoker("雷军",player3);
    }

    public static void lookPoker(String name, TreeSet<Integer> ts){
        System.out.print(name + ": ");
        for (Integer serialNumber : ts) {
            String poker = hm.get(serialNumber);
            System.out.print(poker + " ");
        }
        System.out.println();
    }

}
