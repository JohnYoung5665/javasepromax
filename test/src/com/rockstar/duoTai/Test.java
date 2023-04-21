package com.rockstar.duoTai;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.setAge(2);
        a.setColor("黑");

        Animal a1 = new Cat();
        a1.setAge(1);
        a1.setColor("橘");

        Person p = new Person("张旭", 22);
        p.keepPet(a, "骨头");

        System.out.println("===================================");

        p.keepPet(a1, "小鱼干");

    }
}
