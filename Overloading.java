package com.soham;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
//        fun("soham");
//        fun(24);

//        demo() // it wont work because of ambiguous | Cant decide during overloading which one to take
        demo(3,6,9,2,6,4,2);

    }

    static void fun(int n){
        System.out.println(n);
    }

    static void fun(String s){
        System.out.println(s);
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
