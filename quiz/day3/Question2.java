package com.capgemini.quiz.day3;

public class Question2 {
	 String msg; 
	 public  Question2 () 
	 { 
	 this("Hello"); 
	 } 
	 public  Question2(String str) 
	 { 
	 msg = str+" India"; 
	 } 
	 public static void main (String[] args) 
	{ 
	 Question2 obj = new  Question2(); 
	 System.out.println(obj.msg);
	}
	}
