package com.capgemini.assignment.day1;

public class Task1 {
	static double circum(int r) {
		double p = 2 * 3.14 * r;
		return p;
	}

	public static void main(String[] args) {

		double value = circum(10);
		System.out.println(value);
	}

}
