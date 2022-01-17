package com.test1;

public class JavaCoreString {

    public static void main ( String[] args ){

        //Java-string is an object to represents sequence of characters

        /*There is two ways to declare the strings
       Example :: String s1= "Am a automation Eng" (Here if you create with same context only one time memory allocate)
       Example 2 :: String s2 = new String("Welcome"); (Here if you declare, it doesn't compare the context, every time it will
       create it memory for the string)*/

        String s1 = "Am a automation Eng";
        String s3 ="Hello World";

        String s = new String( "welcome String S" );
        String s2 = new String( "Welcome String s2" );
        String[] splitString = s.split( "String" ); /*Split: is used for to divide*/
        System.out.println( splitString[0] );
        System.out.println( splitString[1] );
        System.out.println( splitString[1].trim() ); /*Trim: we use for to remove the spaces*/



    }
}
