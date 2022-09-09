package com.learning.ds.array.types.multi;

public class ThreeDArray {
    public static void main(String[] args) {
         /*
            It's  a most complex type of array which contains data of same type in linear structure
            and at contiguous memory locations in 3 Dimensions.
            We can say 3-D Array as  Array of 2-D Array
            Example : a[2][4][4] = {{   {1,2,3,4},
                                    {5,6,7,8},
                                    {9,10,11,12},
                                    {13,14,15,16}
                                },{   {1,2,3,4},
                                    {5,6,7,8},
                                    {9,10,11,12},
                                    {13,14,15,16}
                                }}
                       a[2][4][4] specifies a[array][row][column]
         */

        //Declaration
        int[][][] a ;

        // Initialization
        a = new int[2][4][4];
        // OR

        int[][][] a1 = {{   {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        },{   {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        }};

        //Accessing Element - 12

        int numAtPos = a1[1][2][3];
        System.out.println("Element at Position (1,2,3) : "+numAtPos);

        // Accessing All Elements In Tabular Form
        System.out.println("All Elements In Tabular Form : ");
        for(int i = 0 ; i < 2 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                {
                    for (int k = 0 ; k < 4 ;k++){
                        System.out.print(a1[i][j][k]+" ");
                    }
                }

                System.out.println(" ");
            }
            System.out.println();
        }




    }

}
