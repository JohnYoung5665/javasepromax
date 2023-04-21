package com.test;

import java.util.stream.Stream;

public class StreamDemo4 {
    public static void main(String[] args) {
        //一对零散数据  public static<T> Stream<T> of(T... values)       Stream接口中的静态方法

        Stream.of(1,2,3,4,5).forEach(s -> System.out.println(s));
        Stream.of("a",2).forEach(s -> System.out.println(s));

    }
}
