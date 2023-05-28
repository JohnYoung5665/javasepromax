package com.matrix;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//元注解
@Retention(RetentionPolicy.RUNTIME) //runtime:  一直活着，在运行阶段这个注解也不会消失
@Target({ElementType.METHOD,ElementType.FIELD})
public @interface MyTest {
}
