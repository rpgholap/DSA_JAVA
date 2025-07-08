package com.rutuja;

import java.util.Scanner;

// Type Conversion and Casting:
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);
        // above is automatically converting int to float.
        // Java automatic converting int to float.


        int num1 = (int)(67.85f);   //typecasting
        System.out.println(num1);

        // automatic type promotion in expression:
        int a = 257;
        byte b = (byte) (a);
        System.out.println(b);
        // o/p: 1 (remainder of 257/256 is 1)
    }
}
