package com.mycollection;

import com.rockstar.homework.home4.A;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {
        /*
        迭代器的细节注意点：
            1.报错NoSuchElementException
            2.迭代器遍历完毕，指针不会复位
            3.循环中只能用一次next方法
            4.迭代器遍历时，不能用集合的方法进行增加或者删除
                如果实在要删除：那么可以用迭代器提供的remove方法进行删除
                如果要添加，暂时没有办法
       */
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
        //当上面循环结束之后，迭代器的指针已经指向了最后没有元素的位置
        //此时还要获取当前元素的话就会报错
//        it.next();报错NoSuchElementException

        //迭代器遍历完毕，指针不会复位
        System.out.println(it.hasNext());

        //如果我们要继续第二次遍历集合，只能再次获取一个新的迭代器对象
        Iterator<String> it2 = coll.iterator();
        while(it2.hasNext()){
            String str = it2.next();
            System.out.println(str);
        }
    }
}
