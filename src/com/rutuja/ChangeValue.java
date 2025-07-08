package com.rutuja;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1,3,2,45,6};
        change(arr);         // call the function change
        System.out.println(Arrays.toString(arr));    // tostring(): it just take the int array and returns the string value
    }
    static void change(int[] nums){    // nums : copy of the same array i.e. arr = {1,3,2,45,6}
        nums[0] = 99;     // if you make a change to the object via this reference variable, same object will be changed.
    }
}
