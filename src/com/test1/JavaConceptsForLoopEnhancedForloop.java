package com.test1;

public
class JavaConceptsForLoopEnhancedForloop {

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

        int[] arr2 = { 1 , 2 , 3 , 4 , 5 , 6 , 7 };
       /* System.out.println( arr2[ 5 ] );*/

        //For Loop
   /*     for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }*/
        for(int i=0;i<arr2.length;i++)
        {
            System.out.println( arr2[i] );
        }
        String[] name={"Automation","Learning","com"};
       /* for(int i=0;i<name.length;i++)
        {

            System.out.println( name[i] );
        }*/

        //Enhanced For Loop
        for(String s:name)
        {
            System.out.println( s );
        }



    }
}
