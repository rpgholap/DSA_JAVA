package com.rutuja;

//Shadowing: it is the practice of using two variables with the same name within the scope that overlaps

public class Shadowing {
    static int x = 90;       // scope of x variable is entire block  ==> this will be shadowed at line 11.
    public static void main(String[] args) {
        System.out.println(x);  // 90

        // scope of below variable x (lowerlevel) is overriding the upperlevel
        int x = 40;            // the class variable at line 6 is shadowed by this
        System.out.println(x);  // 40
        fun();
    }
    static void fun(){
        System.out.println(x);  // 90
    }
}

// shadowing effect is not supported in methods it is used in main method only.