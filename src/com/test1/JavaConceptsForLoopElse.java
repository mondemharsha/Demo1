package com.test1;

public
class JavaConceptsForLoopElse {

    public static void main ( String[] args ) {


        int[] arr2 = { 1 , 2 , 3 , 4 , 5 , 22 , 2,232,2323,2323,23,23,232345 };
        for(int i=0;i<arr2.length;i++)
        {
            if (arr2 [i] % 2 == 0)
            {
                System.out.println( arr2[i] );
                break;
            }
            else
            {
                System.out.println( arr2[i]+"is not multiple of 2" );
            }
        }




    }
}
