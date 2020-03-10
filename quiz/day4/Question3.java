package com.capgemini.quiz.day4;

public class Question3 {
	public int getData() {//For method overloading,methods must have different 
		// signatures
		return 0;
	}

	public long getData() {
		return 1;
	}

	public static void main(String[] args) {
		Question3 q = new Question3();
		System.out.println(q.getData());
	}

}
