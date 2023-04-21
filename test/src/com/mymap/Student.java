package com.mymap;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

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
    public int compareTo(Student o) {
        //按照学生年龄的升序排序，年龄一样按照姓名的字母排序，同姓名年龄视为同一个人。

        //this：表示当前要添加的元素
        //o：表示已经在红黑树中存在的元素

        //返回值：
        //负数：表示当前要添加的元素是小的，存左边
        //正数：表示当前要添加的元素是大的，存右边
        //0：表示当前要添加的元素已经存在，舍弃
        int i = this.getAge() - o.getAge();
        //              这里调用了String类自己的compareTo方法，默认按照字母abcd....进行排序
        i = i == 0 ? this.getName().compareTo(o.getName()) : i;
        return i;
    }
}
