package com.sample;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	 
        // String input
    	System.out.println("Enter name :");
        String name = sc.nextLine();
        System.out.println("Enter gender :");
        // Character input
        char gender = sc.next().charAt(0);
 
        // Numerical data input
        // byte, short and float can be read
        // using similar-named functions.
        System.out.println("Enter age :");
        int age = sc.nextInt();
        System.out.println("Enter mobile no :");
        long mobileNo = sc.nextLong();
        System.out.println("Enter cgpa :");
        double cgpa = sc.nextDouble();
 
        // Print the values to check if the input was correctly obtained.
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Mobile Number: "+mobileNo);
        System.out.println("CGPA: "+cgpa);
    }
}
