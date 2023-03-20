package com.sample;

/**
 * Hello world!
 *
 */
public class IfElseApp 
{
    public static void main( String[] args )
    {
    	IfElseApp.simpleifelse();
    	IfElseApp.ladderif();
    }
    public static void ladderif() {
    	int i = 20;
    	 
        // condition 1
        if (i == 10)
            System.out.println("i is 10\n");
 
        // condition 2
        else if (i == 15)
            System.out.println("i is 15\n");
 
        // condition 3
        else if (i == 20)
            System.out.println("i is 20\n");
 
        else
            System.out.println("i is not present\n");
 
        System.out.println("Outside if-else-if");
    }
    public static void simpleifelse() {
    	int time = 20;
    	if (time < 18) {
    	  System.out.println("Good day.");
    	} else {
    	  System.out.println("Good evening.");
    	}
    }
}
