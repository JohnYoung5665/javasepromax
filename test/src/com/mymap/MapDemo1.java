package com.mymap;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        /*
            V put(K key,V value)                    添加元素
            V remove(Object key)                    根据键删除键值对元素
            void clear()                            移除所有的键值对元素
            boolean containsKey(Object key)         判断集合是否包含指定的键
            boolean containsValue(Object value)     判断集合是否包含指定的值
            boolean isEmpty()                       判断集合是否为空
            int size()                              集合的长度，也就是集合中键值对的个数
        */

        //1.创建Map集合的对象
        Map<String, String> m = new HashMap<>();

        //2.添加元素
        //put方法的细节：
        //添加/覆盖
        //在添加数据的时候，如果键不存在，那么直接把键值对对象添加到map集合当中，方法返回null
        //在添加数据的时候，如果键是存在的，那么会把原有的键值对对象覆盖，会把被覆盖的值进行返回。
        m.put("张旭","桃乃木香奈");
        m.put("埃隆马斯克","乔布斯");
        m.put("囧雪诺","坦格利安");

        /*String value = m.put("张旭", "坦格利安");
        System.out.println(value);*/

        //根据键删除键值对元素
        //返回值为键值对对象的值
        /*String remove = m.remove("张旭");//桃乃木香奈
        System.out.println(remove);*/

        //清空所有键值对元素
        //m.clear();

        //判断集合中是否包含指定的键
        /*boolean b = m.containsKey("张旭");
        System.out.println(b);*/

        //判断集合中是否包含指定的值
        /*boolean b2 = m.containsValue("坦格利安");
        System.out.println(b2);*/

        //判断集合是否为空
        /*boolean empty = m.isEmpty();
        System.out.println(empty);*/

        //返回集合的长度，也就是集合中键值对的个数
        int size = m.size();
        System.out.println(size);

        //3.打印集合
        System.out.println(m);

    }
}
