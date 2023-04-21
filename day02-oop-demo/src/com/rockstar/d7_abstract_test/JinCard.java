package com.rockstar.d7_abstract_test;

public class JinCard extends JiaYouZhan {
    @Override
    public void pay(double money) {
        System.out.println("您当前消费："+money);
        System.out.println("您卡片当前余额为："+ getMoney());
        double money111 = money * 0.8;
        System.out.println("您最终消费："+money111);
        setMoney(getMoney() - money111);
    }
}
