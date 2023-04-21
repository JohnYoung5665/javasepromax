package com.rockstar.jiekou.demo1;

public abstract class Anamal {
    private String name;
    private int age;

    public abstract void eat();

    public Anamal() {
    }

    public Anamal(String name, int age) {
        this.name = name;
        this.age = age;
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
        return "Anamal{name = " + name + ", age = " + age + "}";
    }
}
