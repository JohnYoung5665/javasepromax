package com.zx.mycharstream1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
            第一步：创建对象
            public FileReader(File file)        创建字符输入流关联本地文件
            public FileReader(String pathname)  创建字符输入流关联本地文件

            第二步：读取数据
            public int read()                   读取数据，读到末尾返回-1
            public int read(char[] buffer)      读取多个数据，读到末尾返回-1

            第三步：释放资源
            public void close()                 释放资源/关流
        */

        //1.创建对象
        FileReader fr = new FileReader("myio\\a.txt");
        //2.读取数据
        char[] arr = new char[4];
        int len;
        while ((len = fr.read(arr)) != -1){
            System.out.print(new String(arr,0,len));
        }
        //3.释放资源
        fr.close();
    }
}
