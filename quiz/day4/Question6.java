package com.capgemini.quiz.day4;

public class Question6 {
	private String function(float i, int f) {
		return ("Question6");
	}

	private String function(double i, double f) {
		return ("This is Question6");
	}

	public static void main(String[] args) {
		Question6 q = new Question6();
		System.out.println(q.function(1., 20));
	}

}
