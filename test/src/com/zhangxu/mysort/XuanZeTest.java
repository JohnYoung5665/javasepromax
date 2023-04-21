package com.zhangxu.mysort;

public class XuanZeTest {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};

        //外循环：循环次数是数组索引-1，循环4次
        for (int i = 0; i < arr.length - 1; i++) {
            //内循环：每次的循环次数
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
