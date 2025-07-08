package com.rutuja;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // block scope:
        {
//            int a = 78;       ----already initialised outside the block in the same method, hence you cannot initialise it again

            // but you can change it
            a = 100;          // reassign the origin ref variable to some other value
            System.out.println(a);

            int c = 99;
            // values initialised in this block, will remain in block.
        }
//        System.out.println(c);    // cannot used outside the block



    }

    // scope means you can only access variables within that function only
    static void random(){
        // function scope: access within the function only
        int num = 67;
        System.out.println(num);
    }
}


// anything initialised outside the block we can use it inside the block, can be updated inside the block
// anything initialised inside the block of the code we can initialised outside the block but cannot use it outside