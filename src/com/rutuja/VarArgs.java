package com.rutuja;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

    // Variable Arguments: when you create a methods which have variable number of arguments
    // when we do not know how many inputs we are given
//     fun();
        multiple(2,3,"Rutuja", "Anuja");
    }

    static void multiple(int a, int b, String ...v){
        // variable length arguments always at the end
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}

