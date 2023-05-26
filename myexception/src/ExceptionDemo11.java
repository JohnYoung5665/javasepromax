public class ExceptionDemo11 {
    public static void main(String[] args) {
        /*
            public String getMessage()      获取发生异常的原因
            public String toString()        获取异常的类型和异常描述信息

            public void printStackTrace()   把异常的错误信息输出在控制台
                                            在底层时利用System.err.println进行输出
                                            把异常的错误信息以红色字体输出在控制台
                                            细节：仅仅时打印信息，不会停止程序运行
         */

        int[] arr = {1,2,3,4,5};

        try {
            System.out.println(arr[10]);
        }catch (ArrayIndexOutOfBoundsException e){
            /*String message = e.getMessage();
            System.out.println(message);//Index 10 out of bounds for length 5*/

            /*String string = e.toString();
            System.out.println(string);//java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5*/

            e.printStackTrace();/*java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5
                                        at ExceptionDemo11.main(ExceptionDemo11.java:13)*/
        }

        System.out.println("看看我执行了吗？");


        //正常的输出语句
        System.out.println(123);
        //错误的输出语句（而是用来打印错误信息）
        System.err.println(123);
    }
}
