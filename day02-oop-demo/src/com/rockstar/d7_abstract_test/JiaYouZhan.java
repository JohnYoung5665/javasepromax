package com.rockstar.d7_abstract_test;

public abstract class JiaYouZhan {
    private String name;
    private Double money;

    public abstract void pay(double money);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
