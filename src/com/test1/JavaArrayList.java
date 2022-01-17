package com.test1;

import java.util.ArrayList;

public class JavaArrayList {

    public static void main ( String[] args ) {
        // write your code here
        int     myNum   = 5;
        String  website = "Learning Automation com";
        char    letter  = 'r';
        double  dec     = 5.99;
        boolean myCard  = true;
        /*System.out.println ( myNum+ "is the value stored in the myNumber variable" );
        System.out.println ( website );*/
        int[] arr = new int[ 5 ];
        arr[ 0 ] = 1;
        arr[ 1 ] = 2;
        arr[ 2 ] = 3;
        arr[ 3 ] = 4;
        arr[ 4 ] = 5;

        int[] arr2 = { 1 , 2 , 3 , 4 , 5 , 22 , 2 };
      /*  System.out.println( arr2[ 5 ] );*/

        for(int i=0;i<arr2.length;i++)
        {
            if (arr2 [i] % 2 == 0)
            {
                System.out.println( arr2[i] );
                break;
            }
            else
            {
                System.out.println( arr2[i] +" is not multiple of 2" );
            }
        }

        //ArrayList Concept

        ArrayList<String>a =new ArrayList<>();
        a.add( "Learning" );
        a.add( "Automation" );
        a.add( "com" );
        System.out.println( a.get( 2 ) );

        //create object of the class==>object.method
    }

}
