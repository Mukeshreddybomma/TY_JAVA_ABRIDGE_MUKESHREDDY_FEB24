package com.capgemini.quiz.day2;

public class Question10 {
	public static void main(String[] args) {
		Question10 obj = new Question10();
		obj.start();
	}

	void start() {
        String stra = "do";
            String strb = method(stra);
        System.out.print(":"+stra + strb);
    }

	String method(String stra) {
        stra = stra + "good";
        System.out.print(stra);
        return "good";
    }
}
