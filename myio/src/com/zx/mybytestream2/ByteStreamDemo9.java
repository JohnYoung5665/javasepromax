package com.zx.mybytestream2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo9 {
    public static void main(String[] args) throws FileNotFoundException {
        /*
            JDK9:IO流捕获异常的写法
         */

        FileInputStream fis = new FileInputStream("D:\\aaa\\movie.mp4");
        FileOutputStream fos = new FileOutputStream("myio\\copy.mp4");

        try (fis;fos){
            //2.拷贝
            int len;
            byte[] bytes = new byte[1024 * 1024 * 5];
            while ((len = fis.read(bytes)) != -1){
                fos.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("我一定会被执行");
        }


    }
}
