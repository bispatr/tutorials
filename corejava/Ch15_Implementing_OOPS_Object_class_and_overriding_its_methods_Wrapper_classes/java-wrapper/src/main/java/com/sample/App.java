package com.sample;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		wrapperdemo();
	}

	public static void wrapperdemo() {
		// Converting int into Integer
		int a = 20;
		Integer i = Integer.valueOf(a);// converting int into Integer explicitly
		Integer j = a;// autoboxing, now compiler will write Integer.valueOf(a) internally

		System.out.println(a + " " + i + " " + j);
	}
}
