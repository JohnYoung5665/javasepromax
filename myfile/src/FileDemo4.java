import java.io.File;
import java.io.IOException;

public class FileDemo4 {
    public static void main(String[] args) throws IOException {
        /*
        public boolean createNewFile()      创建一个新的空文件
        public boolean mkdir()              创建单级文件夹
        public boolean mkdirs()             创建多级文件夹
        public boolean delete()             删除文件、空文件夹
     */

        //1.createNewFile 创建一个新的空文件
        //细节1：如果当前路径表示的文件时不存在的，则创建成功，方法返回true
        //      如果当前路径表示的文件是存在的，则创建失败，方法返回false
        //细节2：如果父级路径时不存在的，那么方法会有异常IOException
        //细节3：createNewFile方法创建的一定时文件，如果路径中不包含后缀名，则创建一个没有后缀的文件
        /*File f1 = new File("D:\\aaa\\ddd");
        boolean b = f1.createNewFile();
        System.out.println(b);//true*/

        //2.mkdir  make Directory.  文件夹（目录）
        //细节1：windows当中路径时唯一的，如果当前路径已经存在，则创建失败，返回false
        //细节2：mkdir方法只能创建单级文件夹，无法创建多级文件夹。
        /*File f2 = new File("D:\\aaa\\aaa");
        boolean b = f2.mkdir();
        System.out.println(b);*/

        //3.mkdirs   创建多级文件夹
        //细节：既可以创建单级的，又可以创建多级的文件夹
        /*File f3 = new File("D:\\aaa\\bbb");
        boolean b = f3.mkdirs();
        System.out.println(b);*/


    }
}
