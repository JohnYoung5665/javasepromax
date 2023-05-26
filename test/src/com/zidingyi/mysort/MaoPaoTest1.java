package com.zidingyi.mysort;

public class MaoPaoTest1 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 3, 1};

        //2.利用冒泡排序将数组中的数据变成1 2 3 4 5
        //第一轮：
        //结束之后，最大值在数组的最右边 - - - - 5

        //外循环：表示我要执行多少轮，如果有N个数据，那么执行N-1轮
        for (int i = 0; i < arr.length - 1; i++) {
            //内循环：每一轮中如何比较数据并找到当前的最大值
            //-1：为了防止索引越界
            //-i：提高效率，每一轮执行的次数应该比上一轮少一次
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //i 依次表示数组中的每一个索引：0 1 2 3 4
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
