package com.rutuja;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the input: ");
        int rollNo = input.nextInt();
        System.out.println("Your Roll No is " + rollNo);


//        Literals: Syntactic representation of boolean, character, numeric or string data
        int a = 7;   // here 7 is an integer literal.

//        Identifiers: names of variables, methods, classes, packages.
        int b = 234_000_000;      // o/p: 234000000

//        string input program:
//        String name = input.next();
//        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);



    }
}
