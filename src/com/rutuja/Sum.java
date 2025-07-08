package com.rutuja;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        int ans = sum2();        // function call: having some value
//        System.out.println(ans);

        int ans = sum3(20, 30);
        System.out.println(ans);
    }


    // pass the value of numbers when you are calling the method in main(): by passing parameters


    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }

    // return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = in.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = in.nextInt();
        int sum;
        sum = num1 + num2;
        return sum;              // return means the function is over.
    }

    // return the value
    static void sum(){
        // take two numbers and print sum
        Scanner in = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = in.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("The Sum of two numbers is: " + sum);
    }

    /*
        return_type name(arguments){
        // body;
        return statement;    // statement and return-type has to be same
        }
     */
}
