package com.rockstar.d14_interface_attention;
public class Test {
    public static void main(String[] args) {
        // 目标：了解接口使用的注意事项。
//        1、接口不能创建对象
          // A a = new A();

//        2、一个类实现多个接口，多个接口的规范不能冲突

//        3、一个类实现多个接口，多个接口中有同样的静态方法不冲突。(接口的静态方法只能接口自己调)
           A.test();
           B.test();
//        4、一个类继承了父类，同时又实现了接口，父类中和接口中有同名方法，默认用父类的。
          Zi zi = new Zi();
          zi.go();

//        5、一个类实现了多个接口，多个接口中存在同名的默认方法，可以不冲突，这个类重写该方法即可。
        Zi2 zi2 = new Zi2();
        zi2.sing();

//        6、一个接口继承多个接口，是没有问题的，如果多个接口中存在规范冲突则不能多继承。

    }
}
//        6、一个接口继承多个接口，是没有问题的，如果多个接口中存在规范冲突则不能多继承。
//interface K extends I, J{
//
//}
//interface I{
//    void run();
//}
//
//interface J{
//    String run();
//}



//    5、一个类实现了多个接口，多个接口中存在同名的默认方法，可以不冲突，这个类重写该方法即可。
class Zi2 implements GanDie1, GanDie2{
    @Override
    public void sing() {
         GanDie1.super.sing();
         GanDie2.super.sing();
         System.out.println("我唱给大家听了");
    }
}

interface GanDie1{
    default void sing(){
        System.out.println("干爹1让你唱小苹果~");
    }
}

interface GanDie2{
    default void sing(){
        System.out.println("干爹2让你唱征服~");
    }
}


// 4、一个类继承了父类，同时又实现了接口，父类中和接口中有同名方法，默认用父类的。
class Zi extends Fu implements GanDie{
    public void go(){
        GanDie.super.run(); // 找干爹这个爸爸的run方法。
    }
}
class Fu {
    public void run(){
        System.out.println("亲爹说赶紧跑路~~");
    }
}
interface GanDie{
    default void run(){
        System.out.println("干爹说留在我身边~~");
    }
}



/**
   接口是干爹。
 */
class C implements A, B{
    @Override
    public void run() {
    }
}

interface B{
    void run();
    static void test(){
    }
}

interface A{
    void run();
    static void test(){
    }
}