package com.sample;

public class RightAngledTriangle implements Triangle {
	String name;

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public int[] getSides() {
		// TODO Auto-generated method stub
		int[] sides = { 4, 6, 7 };
		return sides;
	}

}
