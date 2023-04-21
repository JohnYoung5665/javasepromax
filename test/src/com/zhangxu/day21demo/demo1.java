package com.zhangxu.day21demo;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

public class demo1 {
    public static void main(String[] args) {
        /*
            定义数组并存储一些女朋友对象，利用Arrays中的sort方法进行排序
                要求1：属性有姓名、年龄、身高
                要求2：按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序
                    （姓名中不要有中文或特殊字符，会涉及到后面的知识）
         */

        //创建4个女朋友对象
        GirlFriend g1 = new GirlFriend("xiaoshishi", 18, 1.67);
        GirlFriend g2 = new GirlFriend("xiaodandan", 19, 1.72);
        GirlFriend g3 = new GirlFriend("xiaohuihui", 19, 1.78);
        GirlFriend g4 = new GirlFriend("abc", 19, 1.78);

        //定义数组存储女朋友的信息
        GirlFriend[] arr = {g1, g2, g3, g4};

        //3.利用Arrays中的sort方法进行排序
        //匿名内部类
        Arrays.sort(arr, new Comparator<GirlFriend>() {
            @Override
            public int compare(GirlFriend o1, GirlFriend o2) {
                //按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序
                double temp = o1.getAge() - o2.getAge();
                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;

                if (temp > 0){
                    return 1;
                }else if (temp < 0){
                    return -1;
                }else {
                    return 0;
                }
            }
        });


//        Arrays.sort(arr, (o1, o2)-> {
//                //按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序
//                double temp = o1.getAge() - o2.getAge();
//                temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
//                temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
//
//                if (temp > 0){
//                    return 1;
//                }else if (temp < 0){
//                    return -1;
//                }else {
//                    return 0;
//                }
//            }
//        );

        System.out.println(Arrays.toString(arr));

    }
}

class GirlFriend {
    private String name;
    private int age;
    private double height;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     *
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + ", height = " + height + "}";
    }
}
