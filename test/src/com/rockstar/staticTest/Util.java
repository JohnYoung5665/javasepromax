package com.rockstar.staticTest;

import java.util.ArrayList;

public class Util {
    private Util(){}

    public static int getMaxAge(ArrayList<Student> list){
        int maxAge = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            Student s = list.get(i);
            if (s.getAge() > maxAge){
                maxAge = s.getAge();
            }
        }
        return maxAge;
    }
}
