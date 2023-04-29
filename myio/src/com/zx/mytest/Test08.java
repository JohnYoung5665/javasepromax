package com.zx.mytest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Test08 {
    public static void main(String[] args) throws IOException {
        /*
            需求：
                将多个自定义对象序列化到文件中，但是对象的个数不确定，该如何操作呢
         */

        //1.序列化多个对象
        Student s1 = new Student("zhangsan",23,"延安");
        Student s2 = new Student("lisi",24,"西安");
        Student s3 = new Student("wangwu",25,"咸阳");

        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list,s1,s2,s3);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myio\\a.txt"));
        oos.writeObject(list);

        oos.close();
    }
}
