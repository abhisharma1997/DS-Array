package com.learning.ds.array.types.multi;

public class TwoDArray {

    public static void main(String[] args) {
         /*
            It's  a little complex type of array which contains data of same type in linear structure
            and at contiguous memory locations in 2 Dimensions.
            We can say 2-D Array, Array of Array
            Example : a[4][4] = {   {1,2,3,4},
                                    {5,6,7,8},
                                    {9,10,11,12},
                                    {13,14,15,16}
                                }
                       a[4][4] specifies a[row][column]
         */

        //Declaration
        int[][] a ;

        // Initialization
        a = new int[4][4];
        // OR

        int[][] a1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};

        //Accessing Element - 12

        int numAtPos = a1[2][3];
        System.out.println("Element at Position (2,3) : "+numAtPos);

        // Accessing All Elements In Tabular Form
        System.out.println("All Elements In Tabular Form : ");
        for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }




    }
}
