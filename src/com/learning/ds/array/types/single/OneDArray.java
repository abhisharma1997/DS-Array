package com.learning.ds.array.types.single;

public class OneDArray {

    public static void main(String[] args) {
        /*
            It's  simplest type of array which contains data of same type in linear structure
            and at contiguous memory locations.
            Example : a[4] = {1,2,3,4}
         */

        //Declaration
        int[] a1 ;

        //Initialization
        a1 = new int[4];
        // OR
        int[] a2 = {1,2,3,4,5};

        //Accessing the Elements
        int numAt4Pos = a2[3];

        System.out.println("Element at Position 4 : "+numAt4Pos);

        //Accessing whole array
        System.out.println("All the Elements : ");
        for(int i = 0 ;i < a2.length ; i++){
            System.out.print(a2[i]+" ");
        }
    }
}
