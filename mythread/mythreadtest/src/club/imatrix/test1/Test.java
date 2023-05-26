package club.imatrix.test1;

public class Test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("窗口1");
        t2.setName("窗口2");

        t1.start();
        t2.start();
    }
}
