package com.rutuja;

public class Overloading {

    // Function overloading : when two or more function have the same name, same return type but either arguments should be
   // different or type of argument should be different
    // function overloading decides at compile time which function to run
    public static void main(String[] args) {
        fun(24);
        fun("Rutuja Gholap");

        int ans = sum(3,4);
        System.out.println(ans);
    }

    static int sum(int a, int b){
        return a+b;
    }

    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println("second");
        System.out.println(name);
    }
}
