package club.imatrix.a02threadpool2;

public class MyThreadPoolDemo2 {
    public static void main(String[] args) {
        //向JAVA虚拟机返回可用处理器的数目
        int i = Runtime.getRuntime().availableProcessors();
        System.out.println(i);
    }
}
