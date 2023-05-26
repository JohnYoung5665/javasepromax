package com.zx.a11threadsafe3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    static int ticket = 0;
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        //1.循环
        while (true) {
            //2.同步代码块
            lock.lock();
            try {
                if (ticket == 100) {
                    break;
                } else {
                    Thread.sleep(10);
                    ticket++;
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticket + "张票！！！");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }
}
