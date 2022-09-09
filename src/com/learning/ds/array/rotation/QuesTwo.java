package com.learning.ds.array.rotation;

import java.util.Arrays;

public class QuesTwo {
    /*
    Array Rotation Using Reversal Algo
    Question 1 : Rotation of Array elements to left by d positions
                a[] = {1,2,3,4}
                N = 4
                d = 2
 */
    static void leftRotation(int[] a , int d){
        if (d == 0){
            return;
        }

        int len = a.length;

        reverseArray(a,0,d-1);
        reverseArray(a,d,len-1);
        reverseArray(a,0,len-1);

        Arrays.stream(a).forEach(n->System.out.print(n+" "));


    }

    public static void reverseArray(int[] a, int start, int end){
        int temp;
        while(start < end){
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }



    }

    public static void main(String[] args) {

        int[] a= {1,2,3,4,5};
        int d = 2;

        leftRotation(a,d);

    }
}
