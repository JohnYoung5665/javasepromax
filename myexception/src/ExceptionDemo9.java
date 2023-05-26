public class ExceptionDemo9 {
    public static void main(String[] args) {
        /*
            自己处理（捕获异常）灵魂三问？
                如果try中遇到的问题没有被捕获，怎么执行？
                    相当于try...catch的代码白写了，最终还是会交给虚拟机进行处理
         */

        int[] arr = {1,2,3,4,5};

        try {
            System.out.println(arr[10]);//new ArrayIndexOutOfBoundsException()
            //如果没有捕获到相应的异常，程序会把异常直接交给JVM虚拟机处理
            //虚拟机会创建一个ArrayIndexOutOfBoundsException的对象
            //把异常用红色字体打印在控制台，并且终止代码的运行!!
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }

        System.out.println("看看我执行了吗?");
    }
}
