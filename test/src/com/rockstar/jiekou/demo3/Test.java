package com.rockstar.jiekou.demo3;

public class Test {
    public static void main(String[] args) {
        PingPongMan ppm = new PingPongMan("张旭", 22);
        System.out.println(ppm.getName()+","+ppm.getAge()+"岁");
        ppm.study();
        ppm.StudyEnglish();

        System.out.println("======================================");

        PingPongCoach ppc = new PingPongCoach("张继科", 35);
        System.out.println(ppc.getName()+","+ppc.getAge()+"岁");
        ppc.teach();
        ppc.StudyEnglish();

        System.out.println("======================================");

        BasketballMan bm = new BasketballMan("勒布朗-詹姆斯",36);
        System.out.println(bm.getName()+","+bm.getAge()+"岁");
        bm.study();

        System.out.println("======================================");

        BasketballCoach bc = new BasketballCoach("凯里-欧文",32);
        System.out.println(bc.getName()+","+bc.getAge()+"岁");
        bc.teach();

    }
}
