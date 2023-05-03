package com.sample;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String fileName="test.txt";
        File file=new File(fileName);
        try {
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
          } else {
            System.out.println("File already exists.");
          }
        } catch (IOException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
        
    }
}
