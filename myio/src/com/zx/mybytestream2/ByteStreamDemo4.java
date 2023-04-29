package com.zx.mybytestream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        /*
            练习：
                文件拷贝
                把D:\aaa\movie.mp4拷贝到当前模块下
         */

        long start = System.currentTimeMillis();

        //1.创建对象
        //输入流：从本地文件中读取数据到程序中
        FileInputStream fis = new FileInputStream("D:\\aaa\\movie.mp4");
        //输出流：从程序中写出到本地文件
        FileOutputStream fos = new FileOutputStream("myio\\copy.mp4");
        //2.拷贝
        //核心思想：边读边写
        int b;
        while ((b = fis.read()) != -1){
            fos.write(b);
        }
        //3.释放资源
        //规则：先开的最后关闭
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();

        System.out.println(end - start);


    }
}
