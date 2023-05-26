package club.imatrix.test1;

public class MyThread extends Thread {
    static int tickets = 1000;

    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (tickets == 0) {
                    break;
                } else {
                    /*try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/
                    tickets--;
                    System.out.println(getName() + "@" + tickets);
                }
            }
        }
    }
}
