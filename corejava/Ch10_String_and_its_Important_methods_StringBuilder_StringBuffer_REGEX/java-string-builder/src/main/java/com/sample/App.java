package com.sample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		stringbuilder();
		stringbuffer();
		regex();
	}

	public static void regex() {
		String str1 = "172.16.254.1";
		System.out.println("Input: " + str1);
		System.out.println("Output: " + isValidIPAddress(str1));
		// Test Case: 2
		String str2 = "111.234.162.100";
		System.out.println("Input: " + str2);
		System.out.println("Output: " + isValidIPAddress(str2));
		// Checking for False case.
		// Test Case: 3
		String str3 = "000.129.24.231.89";
		System.out.println("Input: " + str3);
		System.out.println("Output: " + isValidIPAddress(str3));
		// Test Case: 4
		String str4 = "ab.cd.nef.gh.jk";
		System.out.println("Input: " + str4);
		System.out.println("Output: " + isValidIPAddress(str4));
	}

	public static boolean isValidIPAddress(String ip) {
		// regex for digit from 0 to 255.
		String zeroTo255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
		// Regex for a digit from 0 to 255 and followed by a dot, repeat 4 times. this
		// is the regex to validate an IP address.
		String regex = zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255 + "\\." + zeroTo255;
		// Compile the ReGex
		Pattern p = Pattern.compile(regex);
		// if the IP address is empty return false
		if (ip == null) {
			return false;
		}
		// pattern class contains matcher() method to find matching between given IP
		// address and regular expression.
		Matcher m = p.matcher(ip);
		// Return if the IP address matched the ReGex
		return m.matches();
	}

	public static void stringbuffer() {
		String s = "a";
		long start = System.nanoTime();
		StringBuffer strB = new StringBuffer(s);
		for (int i = 0; i < 10000; i++) {
			strB.append("a");
		}
		s = strB.toString();
		System.out.println("Time3: " + (System.nanoTime() - start));
	}

	public static void stringbuilder() {
		StringBuilder str = new StringBuilder();

		str.append("GFG");

		// print string
		System.out.println("String = " + str.toString());

		// create a StringBuilder object
		// using StringBuilder(CharSequence) constructor
		StringBuilder str1 = new StringBuilder("AAAABBBCCCC");

		// print string
		System.out.println("String1 = " + str1.toString());

		// create a StringBuilder object
		// using StringBuilder(capacity) constructor
		StringBuilder str2 = new StringBuilder(10);

		// print string
		System.out.println("String2 capacity = " + str2.capacity());

		// create a StringBuilder object
		// using StringBuilder(String) constructor
		StringBuilder str3 = new StringBuilder(str1.toString());

		// print string
		System.out.println("String3 = " + str3.toString());
	}
}
