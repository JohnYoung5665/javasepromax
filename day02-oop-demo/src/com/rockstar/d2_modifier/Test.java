package com.rockstar.d2_modifier;

public class Test {
    public static void main(String[] args) {
        //  目标：讲解权限修饰符的修饰范围。明白每一种修饰符的作用范围。
        Fu fu = new Fu();
        fu.method();
        fu.protectedMethod();
        fu.publicMethod();
    }
}
