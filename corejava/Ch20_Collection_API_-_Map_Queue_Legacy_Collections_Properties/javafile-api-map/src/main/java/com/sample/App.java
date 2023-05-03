package com.sample;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Student student1 = new Student(1, "John");
		Student student2 = new Student(2, "Mayer");
		Student student3 = new Student(3, "Peter");
		Map<Student, Integer> map = new HashMap<>();
		map.put(student1, 1);
		map.put(student2, 2);
		map.forEach((K, V) -> System.out.println("Existing values in the map: " + V));
		System.out.println();
		map.put(student1, 3);
		map.forEach((K, V) -> System.out.println("Existing values in the map: " + V));
		System.out.println();
		System.out.println(map.containsKey(student1));
		System.out.println(map.containsKey(student3));
		map.put(student3, 4);
		map.forEach((K, V) -> System.out.println("Existing values in the map: " + V));
	}
}
