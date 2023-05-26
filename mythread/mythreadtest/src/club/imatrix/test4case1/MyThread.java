package club.imatrix.test4case1;

import java.util.Random;

public class MyThread extends Thread {

    static double money = 100;
    static int count = 3;
    static final double MIN = 0.01;

    @Override
    public void run() {
        //同步代码块
        synchronized (MyThread.class) {
            if (count == 0) {
                //判断，共享数据是否到了末尾（已经到末尾了）
                System.out.println(getName() + "没有抢到红包！");
            } else {
                //判断，共享数据是否到了末尾（没有到末尾）
                //定义一个变量，表示中奖的金额
                double prize = 0;
                if (count == 1) {
                    //表示此时是最后一个红包
                    //就无需随机，剩余所有的钱都是中奖金额
                    prize = money;
                } else {
                    //表示第一次，第二次（随机）
                    Random r = new Random();
                    double bounds = money - (count - 1) * MIN;
                    prize = r.nextDouble(bounds);
                    if (prize < MIN) {
                        prize = MIN;
                    }
                }

                //从money当中，去掉当前中奖的金额
                money -= prize;
                count--;
                System.out.println(getName() + "抢到了" + prize + "元");
            }
        }
    }
}
