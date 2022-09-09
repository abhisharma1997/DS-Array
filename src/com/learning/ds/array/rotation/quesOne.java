package com.learning.ds.array.rotation;

import java.util.Arrays;

/*
    Array Rotation
    Question 1 : Rotation of Array elements to left by d positions
                a[] = {1,2,3,4}
                N = 4
                d = 2
 */
public class quesOne {
    public static void rotate1(int[] a , int len, int pos){
        /*
        Approach 1 :
            Create a temp array and move all the elements from d position to n-1 into that first
            After this, add first d elements into temp array
         */

        System.out.println("Using Approach 1");
        int[] temp = new int[len];
        int tempIndex=0;

        for(int i = pos ; i < len ; i++){
            temp[tempIndex] = a[i];
            tempIndex++;
        }

        for(int i = 0 ; i<pos;i++){
            temp[tempIndex] = a[i];
            tempIndex++;
        }

        System.out.println("Elements are rotated by :" + pos +" positions");

        Arrays.stream(temp).forEach(n->System.out.print(n+" "));
        System.out.println();





    }

    public static void rotate2(int[] a , int len, int pos){
          /*
        Approach 2 :
            Create a temp array and move all the elements from d position to n-1 into that first
            After this, add first d elements into temp array
         */

        System.out.println("Using Approach 2");

        int p =1;
        int temp = 0;
        while(p<=pos){
            temp = a[0];
            for(int i = 0 ;i<len-1;i++){
                        a[i] = a[i+1];
            }
            a[len-1] = temp;
            p++;

        }
        System.out.println("Elements are rotated by :" + pos +" positions");

        Arrays.stream(a).forEach(n->System.out.print(n+" "));
        System.out.println();

    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int n = arr.length;
        int d = 2;

        rotate1(arr,n,d);

        rotate2(arr,n,d);


    }
}
