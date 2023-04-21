package com.rockstar.mathapi;

public class Test {
    public static void main(String[] args) {
//        System.out.println(isPrime(997));
//        System.out.println(Math.sqrt(997));

        Long start = System.currentTimeMillis();
        for (int i = 1; i < 100000; i++) {
            Boolean flag = isPrime(i);
            if (flag){
                System.out.println(i);
            }
        }
        Long end = System.currentTimeMillis();
        System.out.println(end - start);

//        shuiXian();
//        twoZiMi();
//        rose();
//        five();
    }


    private static void five() {
        int number = 0;
        for (int i = 10000; i <= 99999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            int wan = i / 10000 % 10;
            if (Math.pow(ge,5) + Math.pow(shi,5) + Math.pow(bai,5) + Math.pow(qian,5) + Math.pow(wan,5) == i){
                System.out.println(i + "是五角星数");
                number++;
            }
        }
        System.out.println("有" + number + "个五角星数");
    }

    private static void rose() {
        int number = 0;
        for (int i = 1000; i <= 9999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            if (Math.pow(ge,4) + Math.pow(shi,4) + Math.pow(bai,4) + Math.pow(qian,4) == i){
                System.out.println(i + "是四叶玫瑰数");
                number++;
            }
        }
        System.out.println("有" + number + "个四叶玫瑰数");
    }

    private static void twoZiMi() {
        int number = 0;
        for (int i = 10; i <= 99; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            if (Math.pow(ge,2) + Math.pow(shi,2) == i){
                System.out.println(i + "是二位自幂数");
                number++;
            }
        }
        System.out.println(number);
    }

    public static void shuiXian(){
        int number = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if (Math.pow(ge,3) + Math.pow(shi,3) + Math.pow(bai,3) == i){
                System.out.println(i + "是水仙花数");
                number++;
            }
        }
        System.out.println("有" + number + "个水仙花数");
    }


    //判断质数，改进
    public static boolean isPrime(int number){
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }
}
