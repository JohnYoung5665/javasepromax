package com.rockstar.duoTai;

public class Person {
    private String name;
    private int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void keepPet(Animal a, String something){
        if (a instanceof Dog d){
            System.out.println("年龄为"+getAge()+"岁的"+getName()+"养了一只"+d.getColor()+"颜色的"+d.getAge()+"岁的狗");
            d.eat(something);
            d.lookHome();
        }else if (a instanceof Cat c){
            System.out.println("年龄为"+getAge()+"岁的"+getName()+"养了一只"+c.getColor()+"颜色的"+c.getAge()+"岁的猫");
            c.eat(something);
            c.catchMouse();
        }
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }
}
