package com.capgemini.quiz.day4;

public class Question7 {
	private String function(String temp,int data,int sum) {
		return("Question7");
	}
	private String function(String temp,int data) {
		return("This is Question7");
	}
	public static void main(String[] args) {
		Question7 q=new Question7();
		System.out.println(q.function("Question7", 0, 20));
	}

}
