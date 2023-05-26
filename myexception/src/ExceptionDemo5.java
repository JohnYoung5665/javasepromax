public class ExceptionDemo5 {
    public static void main(String[] args) {
        /*
            JVM虚拟机默认处理异常的方式
                1.把异常的名称，异常原因及异常出现的位置等信息输出在了控制台
                2.程序停止执行，异常下面的代码不会再执行了
         */

        System.out.println("666666666666666666");
        System.out.println(2/0);//ArithmeticException   算术异常
        System.out.println("888888888888888888");
        System.out.println("999999999999999999");


    }
}
