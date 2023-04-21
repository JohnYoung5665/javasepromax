package com.rockstar.d2_static_test;

public class ArraysUtils {
    private ArraysUtils() {
    }

    public static String toString1(int[] arr){
        if (arr == null){
            return null;
        }
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
//            s += i == arr.length - 1 ? arr[i] : arr[i] + ",";
            if (i == arr.length - 1){
                s += arr[i];
            }else {
                s += arr[i]+", ";
            }
        }
        s += "]";
        return s;
    }

    public static double getAerage(double[] arr){
        double max = arr[0];
        double min = arr[0];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
            sum += arr[i];
        }
        double aerage = (sum - max - min) / (arr.length - 2);
        return aerage;
    }
}
