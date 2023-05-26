package club.imatrix.test2;

public class Test {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("张旭");
        t2.setName("马斯克");

        t1.start();
        t2.start();
    }
}
