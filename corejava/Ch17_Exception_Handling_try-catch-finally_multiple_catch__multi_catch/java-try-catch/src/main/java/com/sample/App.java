package com.sample;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		multipleException();
		simpleException();
		try {
			validate(10);
		} catch (Exception ex) {
			System.out.println("Got exception in eligibility to vote :" + ex.getMessage());
		} finally {
			System.out.println("Program execution completed successfully");
		}
	}

	public static void validate(int age) throws InvalidAgeException {
		if (age < 18) {

			// throw an object of user defined exception
			throw new InvalidAgeException("age is not valid to vote");
		} else {
			System.out.println("welcome to vote");
		}
	}

	public static void multipleException() {
		int arr[] = { 30, 40, 50, 0, 70, 80 };
		int a = 1000, b = 0;
		for (int i = 0; i < arr.length + 1; i++) {
			try {
				b = a / arr[i];
				System.out.println("Divide a by arr[" + i + "] is " + b);
			} catch (ArithmeticException ae) {
				System.out.println("Got some exception :" + ae.getMessage());
			} catch (ArrayIndexOutOfBoundsException are) {
				System.out.println("Got exception related to array" + are.getMessage());
			}
		}

	}

	public static void simpleException() {
		try {
			int a = 9, b = 0, c = 0;
			c = a / b;
			System.out.println("Result is c=" + c);
		} catch (Exception ex) {
			System.out.println("Got some exception " + ex.getMessage());
		}
	}
}
