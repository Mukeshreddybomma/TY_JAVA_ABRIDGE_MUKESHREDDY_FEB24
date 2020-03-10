package com.capgemini.quiz.day7;

public abstract class Question10 {
	private int a,b;
	public void call(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
}


