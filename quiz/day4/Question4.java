package com.capgemini.quiz.day4;

public class Question4 {
	private String function() {
		return ("Question4");
	}
	/* it cannot be overridden in private to public
	 * 
	 */
	public final static String function(int data) {
		return("This is Question4");
	}
	public static void main(String[] args) {
		Question4 q=new Question4();
		System.out.println(q.function());
	}
}

