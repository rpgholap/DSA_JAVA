package com.rutuja;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please Enter temperature in C: ");
        float tempInC = in.nextFloat();
        float tempInF = (tempInC * 9/5) + 32 ;
        System.out.println(tempInF);
    }
}
