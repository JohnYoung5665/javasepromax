package com.myset;

import java.util.Objects;

public class StudentTwo implements Comparable<StudentTwo>{
    private String name;
    private int age;
    private double chinese;
    private double math;
    private double english;


    public StudentTwo() {
    }

    public StudentTwo(String name, int age, double chinese, double math, double english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
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

    /**
     * 获取
     * @return chinese
     */
    public double getChinese() {
        return chinese;
    }

    /**
     * 设置
     * @param chinese
     */
    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    /**
     * 获取
     * @return math
     */
    public double getMath() {
        return math;
    }

    /**
     * 设置
     * @param math
     */
    public void setMath(double math) {
        this.math = math;
    }

    /**
     * 获取
     * @return english
     */
    public double getEnglish() {
        return english;
    }

    /**
     * 设置
     * @param english
     */
    public void setEnglish(double english) {
        this.english = english;
    }

    public String toString() {
        return "StudentTwo{name = " + name + ", age = " + age + ", chinese = " + chinese + ", math = " + math + ", english = " + english + ", 总分 = " + getSum(this) + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentTwo that = (StudentTwo) o;
        return age == that.age && Double.compare(that.chinese, chinese) == 0 && Double.compare(that.math, math) == 0 && Double.compare(that.english, english) == 0 && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, chinese, math, english);
    }

    @Override
    public int compareTo(StudentTwo o) {
        double thisSum = getSum(this);
        double oSum = getSum(o);
        if (thisSum != oSum){
            return (int) (thisSum - oSum);
        }else if (this.getChinese() != o.getChinese()){
            return (int) (this.getChinese() - o.getChinese());
        } else if (this.getMath() != o.getMath()) {
            return (int) (this.getMath() - o.getMath());
        }else if (this.getEnglish() != o.getEnglish()) {
            return (int) (this.getEnglish() - o.getEnglish());
        }else if (this.getAge() != o.getAge()) {
            return this.getAge() - o.getAge();
        }else if (this.getName().length() != o.getName().length()) {
            return this.getName().length() - o.getName().length();
        }else {
            return 0;
        }
    }

    public double getSum(StudentTwo s){
        return s.getChinese() + s.getEnglish() + s.getMath();
    }
}
