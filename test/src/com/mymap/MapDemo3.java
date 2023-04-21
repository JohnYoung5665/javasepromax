package com.mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapDemo3 {
    public static void main(String[] args) {
        //Map集合的第二种遍历方式

        //三个课堂练习：
        //
        //练习一：  通过键值对对象进行遍历map集合，要求：装着键值对对象的单列集合使用增强for的形式进行遍历
        //练习二：  通过键值对对象进行遍历map集合，要求：装着键值对对象的单列集合使用迭代器的形式进行遍历
        //练习三：  通过键值对对象进行遍历map集合，要求：装着键值对对象的单列集合使用lambda的形式进行遍历

        //1.创建Map集合对象
        Map<String, String> map = new HashMap<>();

        //2.添加元素
        map.put("张旭","桃乃木香奈");
        map.put("埃隆马斯克","火箭回收");
        map.put("囧雪诺","坦格利安");

        //3.Map集合的第二种扁你方式
        //通过键值对对象进行遍历
        //3.1通过一个方法获取所有的键值对对象，返回一个Set集合
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //3.2遍历entrySet这个集合，去得到里面每一个键值对对象

        //练习三：Lambda表达式遍历
        entrySet.forEach(entry -> {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println(key + "=" + value);
            }
        );

        //练习二：迭代器遍历
        /*Iterator<Map.Entry<String, String>> it = entrySet.iterator();
        while (it.hasNext()){
            //获取到每一个键值对对象
            Map.Entry<String, String> entry = it.next();
            //利用键值对对象的get()方法，获取对象里面的键和值
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }*/

        //练习一：增强for遍历
        /*for (Map.Entry<String, String> entry : entrySet) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }*/
    }
}
