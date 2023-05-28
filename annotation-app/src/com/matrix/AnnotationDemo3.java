package com.matrix;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

/*
* 目标：
* */
public class AnnotationDemo3 {
    @Test
    public void parseClass(){
        //a.先得到类对象
        Class c = BookStore.class;
        //b.判断这个类上面是否存在这个注解
        if (c.isAnnotationPresent(Bookk.class)){
            //c.直接获取该注解对象
            Bookk book = (Bookk) c.getDeclaredAnnotation(Bookk.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.authors()));
        }
    }


    @Test
    public void parseMethod() throws NoSuchMethodException {
        //a.先得到类对象
        Class c = BookStore.class;
        Method m = c.getDeclaredMethod("test");
        //b.判断这个类上面是否存在这个注解
        if (m.isAnnotationPresent(Bookk.class)){
            //c.直接获取该注解对象
            Bookk book = (Bookk) m.getDeclaredAnnotation(Bookk.class);
            System.out.println(book.value());
            System.out.println(book.price());
            System.out.println(Arrays.toString(book.authors()));
        }
    }
}

@Bookk(value = "《情深深雨蒙蒙》",price = 99.9,authors = {"琼瑶","dlei"})
class BookStore{
    @Bookk(value = "《三少爷的剑》",price = 399.9,authors = {"古龙","熊耀华"})
    public void test(){

    }
}
