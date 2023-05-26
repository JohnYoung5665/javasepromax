package com.zidingyi.day21demo;

import java.util.Arrays;

public class demo2 {
    public static void main(String[] args) {
        /*
            不死神兔：
                有一对兔子，从出生后第三个月起每个月都生一对兔子，
                小兔子长到第三个月后每个月又省一对兔子
                假如兔子都不死，问第十二个月的兔子对数为多少？
                    1月：1
                    2月：1
                    3月：2
                    4月：3
                    5月：5
                    6月：8
            特点：从第三个数据开始，是前两个数据和(斐波那契额数列)
         */

        //求解1：
        //1.创建一个长度为12的数组
        int[] arr = new int[12];
        //2.手动给0索引和1索引的数据进行赋值
        arr[0] = 1;
        arr[1] = 1;
        //3.利用循环给剩余的数据进行赋值
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        //4.遍历数组
        System.out.println(Arrays.toString(arr));

        //求解2：
        //递归的方式取完成
        //1.递归的出口
        //2.找到递归的规律
        //rabbit(12) = rabbit(11) + rabbit(10);
        //rabbit(11) = rabbit(10) + rabbit(9);
        //rabbit(10) = rabbit(9) + rabbit(8);
        //...
        //rabbit(3) = rabbit(2) + rabbit(1);
        //rabbit(2) = 1
        //rabbit(1) = 1

        System.out.println(rabbit(12));

    }

    private static int rabbit(int month) {
        if (month == 1 || month == 2){
            return 1;
        }
        return rabbit(month - 1) + rabbit(month - 2);
    }
}
