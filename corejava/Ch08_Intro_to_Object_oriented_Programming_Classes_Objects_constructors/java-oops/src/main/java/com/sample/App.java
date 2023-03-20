package com.sample;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Without constructor");
		Hello obj = new Hello();
		System.out.println(obj);
		System.out.println("With constructor");
		obj = new Hello("Test");
		System.out.println(obj);
	}
}
