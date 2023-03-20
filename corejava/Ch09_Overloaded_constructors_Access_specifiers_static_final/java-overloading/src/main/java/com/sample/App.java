package com.sample;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Shape obj = new Shape();
		System.out.println("No shape");
		obj.area();
		obj = new Circle();
		System.out.println("Pointing to circle");
		obj.area();
		obj = new Rectangle();
		System.out.println("Pointing to Rectangle");
		obj.area();
	}
}
