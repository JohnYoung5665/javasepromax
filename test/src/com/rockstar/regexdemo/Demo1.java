package com.rockstar.regexdemo;

public class Demo1 {
    public static void main(String[] args) {
//        String phoneNumber = "15591127916";
//        String regex1 = "1[3-9]\\d{9}";
//        System.out.println(phoneNumber.matches(regex1));

        //020-2324242 02122442  027-42424  0712-3242434
        String regex2 = "0\\d{2,3}-?[1-9]\\d{4,9}";
        System.out.println("020-2324242".matches(regex2));

        //邮箱号码
        //  3232323@qq.com  zhangsan@itcast.cnn     dlei0009@163.com    dlei0009@pci.com.cn
        String regex3 = "\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";

        //用户名
        String regex4 = "\\w{4,16}";

        //身份证简单要求
        String shenFen = "61062220010724001x";
        String regexMan = "[1-9]\\d{16}[\\dXx]{1}";
        String regexMan1 = "[1-9]\\d{16}(\\d|(?i)x)";
        System.out.println(shenFen.matches(regexMan1));

        //4108-01-1993-02-28-457-x
        //6106-22-2001-07-24-001-4
        //1504-01-1981-07-05-387-X
        String regexpeople = "[1-9]\\d{5}[1-2][09]\\d{2}(0[1-9]|1[0-2])(2[0-2])";
        String aaa = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|10|11|12)(0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";




    }
}
