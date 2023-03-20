package com.sample;

/**
 * Hello world!
 *
 */
public class PrimitiveApp 
{
    public static void main( String[] args )
    {
    	int myNum = 5;               // integer (whole number)
        float myFloatNum = 5.99f;    // floating point number
        char myLetter = 'D';         // character
        boolean myBool = true;       // boolean
        String myText = "Hello";     // String    
        System.out.println(myNum);
        System.out.println(myFloatNum);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);
        WideningExample.widen();
        PrimitiveApp.narrowing();
    }
    public static void narrowing() {
        int i = 23;
        char ch = (char) i;
        System.out.println("Character value of the given integer: "+ch);
    }
}
