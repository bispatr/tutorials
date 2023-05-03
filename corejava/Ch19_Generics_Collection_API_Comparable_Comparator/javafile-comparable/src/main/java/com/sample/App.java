package com.sample;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	comparatorDemo();
    	System.out.println("comparable demo");
    	comparableDemo();
    }
    public static void comparatorDemo() {
    	ArrayList<Student> al=new ArrayList<Student>();  
    	al.add(new Student(101,"Vijay",23));  
    	al.add(new Student(106,"Ajay",27));  
    	al.add(new Student(105,"Jai",21));  
    	  
    	System.out.println("Sorting by Name");  
    	//Using NameComparator to sort the elements  
    	Collections.sort(al,new NameComparator());  
    	//Traversing the elements of list  
    	for(Student st: al){  
    	System.out.println(st.rollno+" "+st.name+" "+st.age);  
    	}  
    	  
    	System.out.println("sorting by Age");  
    	//Using AgeComparator to sort the elements  
    	Collections.sort(al,new AgeComparator());  
    	//Travering the list again  
    	for(Student st: al){  
    	System.out.println(st.rollno+" "+st.name+" "+st.age);  
    	}  
    }
    public static void comparableDemo() {
    	ArrayList<Student> al=new ArrayList<Student>();  
    	al.add(new Student(101,"Vijay",23));  
    	al.add(new Student(106,"Ajay",27));  
    	al.add(new Student(105,"Jai",21));  
    	  
    	Collections.sort(al);  
    	for(Student st:al){  
    	System.out.println(st.rollno+" "+st.name+" "+st.age);  
    	}  
    }
}
