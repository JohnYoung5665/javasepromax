package com.mymap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class MapDemo2 {
    public static void main(String[] args) {
        //Map集合的第一种遍历方式

        //三个课堂练习：
        //
        //练习一：  利用键找值的方式遍历map集合，要求：装着键的单列集合使用增强for的形式进行遍历
        //练习二：  利用键找值的方式遍历map集合，要求：装着键的单列集合使用迭代器的形式进行遍历
        //练习三：  利用键找值的方式遍历map集合，要求：装着键的单列集合使用lambda表达式的形式进行遍历
        /*
            Map集合的获取功能：
            V get(Object key)                   根据键获取值
            Set<K> keySet()                     获取所有键的集合
            Collection<V> values()              获取所有值的集合
            Set<Map.Entry<K,V>>   entrySet()    获取所有键值对对象的集合
        */

        //1.创建Map集合的对象
        Map<String, String> m = new HashMap<>();

        //2.添加元素
        m.put("张旭","桃乃木香奈");
        m.put("埃隆马斯克","火箭回收");
        m.put("囧雪诺","坦格利安");

        //3.通过键找值
        //3.1获取所有的键，把这些键放到一个单列集合当中

        //练习三：
        //集合调用keySet()方法返回当前集合中所有的键到 Set集合中（单列集合）
        Set<String> keySet = m.keySet();
        //Lambda表达式遍历Set集合
        keySet.forEach(keys -> {
                //利用Map集合中的键找值方法get()
                //找到当前键所对应的值
                String values = m.get(keys);
                System.out.println(keys + "=" + values);
            }
        );

        //练习二：
        /*Set<String> keySet = m.keySet();
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()){
            String jian = it.next();
            //利用map集合中的键获取对应的值  get()
            String value = m.get(jian);
            System.out.println(jian + "=" + value);
        }*/

        //练习一
        /*Set<String> keys = m.keySet();
        for (String key : keys) {
            //利用map集合中的键获取对应的值  get()
            String value = m.get(key);
            System.out.println(key + "=" + value);
        }*/

    }
}
