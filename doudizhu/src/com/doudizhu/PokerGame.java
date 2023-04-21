package com.doudizhu;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {

    private static ArrayList<String> list = new ArrayList<>();

    static {
        //准备牌
        String[] color = {"♦","♣","♥","♠"};
        String[] number = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};

        for (String c : color) {
            for (String n : number) {
                list.add(c + n);
            }
        }
        list.add("小王");
        list.add("大王");
    }

    public PokerGame(){
        //洗牌
        Collections.shuffle(list);

        //发牌
        ArrayList<String> lord = new ArrayList<>();
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();

        //遍历牌盒得到每一张牌
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);

            //3张底牌
            if (i <= 2){
                lord.add(s);
                continue;
            }
            if (i % 3 == 0){
                player1.add(s);
            }else if (i % 3 == 1){
                player2.add(s);
            }else {
                player3.add(s);
            }
        }

        //看牌
        lookPoker("底牌",lord);
        lookPoker("张旭",player1);
        lookPoker("埃隆马斯克",player2);
        lookPoker("雷军",player3);
    }

    //看牌
    public void lookPoker(String name, ArrayList<String> list){
        System.out.print(name + ":");

        for (String poker : list) {
            System.out.print(poker + " ");
        }

        System.out.println();
    }
}
