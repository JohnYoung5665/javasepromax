import java.io.File;
import java.io.IOException;

public class FileTest1 {
    public static void main(String[] args) throws IOException {
        /*
            需求：
                在当前模块下的aaa文件夹中创建一个a.txt文件
         */
        File f1 = new File("myfile\\aaa\\a.txt");
        boolean b = f1.createNewFile();
        System.out.println(b);
    }
}
