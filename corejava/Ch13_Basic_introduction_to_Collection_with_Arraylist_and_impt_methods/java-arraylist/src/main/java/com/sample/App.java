package com.sample;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		arraylistdemo();
	}

	public static void arraylistdemo() {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);
	}
}
