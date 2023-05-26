package com.zidingyi.mysort;

import java.util.Random;

public class ChaRuTest {
    public static void main(String[] args) {
//        int[] arr = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};

        int[] arr = new int[1000000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }

        long startTime = System.currentTimeMillis();


        int startIndex = -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]){
                startIndex = i + 1;
                break;
            }
        }

        for (int i = startIndex; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]){
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }
}
