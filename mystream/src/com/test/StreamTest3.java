package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest3 {
    public static void main(String[] args) {
        //1.创建两个ArrayList集合
        ArrayList<String> manList = new ArrayList<>();
        ArrayList<String> womenList = new ArrayList<>();
        //2.添加数据
        Collections.addAll(manList, "蔡坤坤,24", "叶齁咸,23", "刘不甜,22", "吴签,24", "谷嘉,30", "肖梁梁,27");
        Collections.addAll(womenList, "赵小颖,35", "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");

        //1
        Stream<String> stream1 = manList.stream()
                .filter(s -> s.split(",")[0].length() == 3)
                .limit(2);


        //2
        Stream<String> stream2 = womenList.stream()
                .filter(s -> s.split(",")[0].startsWith("杨"))
                .skip(1);


        //3
        //Stream.concat(stream1,stream2);

        //4
        /*Stream.concat(stream1,stream2)
                .map(new Function<String, Actor>() {
                    @Override
                    public Actor apply(String s) {
                        String name = s.split(",")[0];
                        int age = Integer.parseInt(s.split(",")[1]);
                        return new Actor(name,age);
                    }
                })
                .forEach(s -> System.out.println(s));*/

        /*Stream.concat(stream1,stream2)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .forEach(s -> System.out.println(s));*/

        //5
        List<Actor> collect = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());

        System.out.println(collect);


    }
}
