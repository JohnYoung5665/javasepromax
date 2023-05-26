package club.imatrix.test3;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            synchronized (MyThread.class){
                if (i % 2 != 0){
                    System.out.println(getName() + "@" +i);
                }
            }
        }
    }
}
