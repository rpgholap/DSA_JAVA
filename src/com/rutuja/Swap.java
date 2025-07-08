package com.rutuja;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;


//         swap numbers code:
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println(a + " " + b);


        swap(a,b);
        System.out.println(a + " " + b);
        String name = "Rutuja Gholap";
        changeName(name);
        System.out.println(name);
    }

    private static void changeName(String naam) {
        naam = "Anuja Gholap";       // not changing -- creating object    *strings are immutable
                                     // so if we change naam it is not going to reflect in main function
                                     // we cannot use "naam" outside this bcz it is in this scope only
    }

    // name is not going to change bcz name and naam is same because
    // in java there is only pass by value not pass by reference
    // so name and naam is pointing to same object i.e. Rutuja Gholap

    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // this change will only be valid in this function scope only.
    }
}
