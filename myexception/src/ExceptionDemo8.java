public class ExceptionDemo8 {
    public static void main(String[] args) {
        /*
            自己处理（捕获异常）灵魂二问：
                如果try中可能会遇到多个问题，怎么执行？
                会写多个catch与之对应(如果捕获到异常，则出现异常的代码下面的代码不会执行)
                细节：
                    如果我们要捕获多个异常，这些异常中如果存在父子类关系的话，那么父类一定要写在下面（因为多态的原因）

                了解性：
                    在JDK7之后，我们可以在catch中同时捕获多个异常，中间用|进行隔开
                    表示如果出现了A异常或者B异常的话，采取同一种处理方案
         */

        int[] arr = {1,2,3,4,5};

        try {
            System.out.println(arr[10]);//ArrayIndexOutOfBoundsException
            System.out.println(2/0);//ArithmeticException
            String s = null;
            System.out.println(s.equals("abc"));
        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("索引越界了,算术异常");
        }catch (NullPointerException e){
            System.out.println("空指针异常");
        }catch (Exception e){
            System.out.println("Exception");
        }

        System.out.println("看看我执行了吗");

    }
}
