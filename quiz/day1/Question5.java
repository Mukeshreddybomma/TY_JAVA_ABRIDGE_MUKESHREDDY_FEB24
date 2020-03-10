package com.capgemini.quiz.day1;

public class Question5 {
	public static void main(String[] args) {
		int i=0;
		int j=5;
		for( ; (i<3)&&(j++<10); i++) {
			System.out.println(" "+i+" "+j);
		}
		System.out.println(" "+i+" "+j);
	}

}
