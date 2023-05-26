public class ExceptionDemo3 {
    public static void main(String[] args) {
        /*
            异常作用一：异常是用来查询bug的关键参考信息
            异常作用二：异常可以作为方法内部的一种特殊返回值，以便通知调用者底层的执行情况
        */
        Student2 stu = new Student2("张三,23");
        System.out.println(stu);

        //ArrayIndexOutOfBoundsException    数组索引越界异常
        //此时Student2(String str)构造方法里面
        //str.split("-"):要分割的符号在创建对象时里面没有","
        //所以分割完之后它还是一个整体被放在arr数组中
        //Integer.parseInt(arr[1])：此时为arr数组中并没有索引为1的元素

        /*public Student2(String str) {//"张三,23"
            String[] arr = str.split("-");
            //arr 0: 张三,23
            this.name = arr[0];
            this.age = Integer.parseInt(arr[1]);
        }*/
    }
}
