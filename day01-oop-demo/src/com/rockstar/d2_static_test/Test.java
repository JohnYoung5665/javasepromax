package com.rockstar.d2_static_test;

public class Test {
    public static void main(String[] args) {
        int[] arr = {10, 20, 50, 34, 100};
        int[] arr1 = null;
        int[] arr2 = {};
        System.out.println(ArraysUtils.toString1(arr));
        System.out.println(ArraysUtils.toString1(arr1));
        System.out.println(ArraysUtils.toString1(arr2));

        double[] arr3 = {86.5, 100, 95.5, 97, 89.5};
        System.out.println(ArraysUtils.getAerage(arr3));
    }
}
