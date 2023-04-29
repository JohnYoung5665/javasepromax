package com.zx.myconvertstream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class ConcertStreamDemo2 {
    public static void main(String[] args) throws IOException {
        /*
            利用转换流按照字符编码写出
         */

        /*//1.创建转换流对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myio\\gbkfile.txt"),"GBK");
        //2.写出数据
        osw.write("你好你好");
        //3.释放资源
        osw.close();*/

        FileWriter fw = new FileWriter("myio\\gbkfile.txt", Charset.forName("GBK"));
        fw.write("你好你好");
        fw.close();




    }
}
