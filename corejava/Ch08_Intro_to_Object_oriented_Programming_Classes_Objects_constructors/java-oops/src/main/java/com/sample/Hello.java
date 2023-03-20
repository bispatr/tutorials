package com.sample;

public class Hello {
	String name;

	public Hello() {

	}

	public Hello(String name) {
		this.name = name;
		System.out.println("Setting name to :" + this.name);
	}

	@Override
	public String toString() {
		return "Hello [name=" + name + "]";
	}

}
