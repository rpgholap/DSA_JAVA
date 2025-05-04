package com.rutuja;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
            for loop: used when you know how many times the loop is going to run

            for(initialization; condition; increment/decrement){
                // body;
            }
         */

        // Q. Print numbers from 1 to 5

        System.out.println("Output using for Loop: ");
        for(int num=1; num<=5;num+=1){
            System.out.println(num);
        }

        // print numbers from 1 to n:

        System.out.println("Output using for Loop: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int num1=0; num1<=n;num1++){
            System.out.println(num1);
        }


        /*
            While Loop: used when you don't know how many times the loop is going to run

            while(condition){
                // body
            }
         */

        System.out.println("Output using while Loop: ");
        int num2 = 51;
        while(num2 <= 60){
            System.out.println(num2);
            num2 += 1;
        }

        /*
            do-while Loop: it will execute at least once (bcz: first it will execute the body and then it will check)

            do {
                // body
            } while(condition);

         */
        System.out.println("Output using do-while Loop: ");
        int num3 = 90;
        do {
            System.out.println(num3);
            num3++;
        } while (num3<=100);
    }

}
