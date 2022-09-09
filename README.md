# DS-Array

Types of Array :

1. Single Dimensional Array

   It's  simplest type of array which contains data of same type in linear structure
   and at contiguous memory locations.
   Example : a[4] = {1,2,3,4}


2. Multi Dimensional Array


    1. 2 Dimensional Array
   
       It's  a little complex type of array which contains data of same type in linear structure
       and at contiguous memory locations in 2 Dimensions.
       We can say 2-D Array, Array of Array
   
       Example : a[4][4] = {   {1,2,3,4},
       {5,6,7,8},
       {9,10,11,12},
       {13,14,15,16}
       }
   
       a[4][4] specifies a[row][column]
   

    3. 3 Dimensional Array
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
        


Array Rotation

Question 1 : Rotation of Array elements to left by d positions

a[] = {1,2,3,4}

N = 4

d = 2

O/P -> {3,4,1,2}
