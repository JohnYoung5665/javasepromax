package com.test;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo3 {
    public static void main(String[] args) {
        //数组        public static <T> Stream<T> stream(T[] array)     Arrays工具类中的静态方法

        //1.创建数组
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};

        String[] arr2 = {"a","b","c"};

        //2.获取stream流
        //Arrays.stream(arr1).forEach(s -> System.out.println(s));

        //Arrays.stream(arr2).forEach(s -> System.out.println(s));

        //注意：
        //Stream接口中静态方法of的细节
        //方法的形参是一个可变参数，可以传递一对零散的数据，也可以传递数组
        //但是数组必须是引用数据类型的，如果传递基本数据类型，是会把整个数组当作一个元素，放到stream当中。
        Stream.of(arr1).forEach(s -> System.out.println(s));//[I@6d311334

    }
}
