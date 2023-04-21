package com.rockstar.homework;

public class HomeWork1 {
    public static void main(String[] args) {
        /*
        每一款手机都有自己的品牌和价格,原来的手机只能打电话,发短信;
        现在的新手机,在打电话和发短信的基础上还能玩儿游戏,请设计程序,完成手机的升级!
        * */
        NewPhone p1 = new NewPhone();
        p1.setBrand("Iphone");
        p1.setPrice(5399);
        System.out.println("新手机的品牌为："+p1.getBrand()+"新手机的价格为："+p1.getPrice());
        p1.call("埃隆马斯克");
        p1.message();
        p1.playGame();
        System.out.println("=======================");

        /*每一款手机都有自己的品牌和价格,原来的手机只能打电话,发短信,来电显示只能显示手机号;
        现在的新手机针对于来电显示做了功能的升级,还能显示头像,还能显示归属地,请设计程序,完成手机的升级!*/
        p1.show();

        System.out.println("=======================");

        /*白色4条腿的北极熊(Bear)会吃(吃蜂蜜)和抓鱼(catchFish)
        黑色4条腿的大熊猫(Panda)会吃(吃竹子)和爬树(climbTree)
        要求: 把北极熊和大熊猫的共性提取动物类(Animal)中,使用抽象类*/

    }
}
