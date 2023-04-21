package com.myset;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
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
        return "Student{name = " + name + ", age = " + age + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    //节点每比较一次都会调用这个方法
    //this:表示当前要添加的元素是小的，存右边
    //o：表示已经再红黑树存在的元素

    //返回值：
    //负数：表示当前要添加的元素是小的，存右边
    //正数：表示当前要添加的元素是大的，存右边
    //0：表示当前要添加的元素已经存在，舍弃
    public int compareTo(Student o) {
        System.out.println("=============");
        System.out.println("this:" + this);
        System.out.println("o:" + o);
        //指定排序规则
        //只看年龄，我想要按照年龄的升序进行排列
        int result = this.age - o.age;
        //次要判断条件: 年龄相同时，按照姓名的字母顺序排序
        result = result == 0 ? this.name.compareTo(o.getName()) : result;
        return result;
    }
}
