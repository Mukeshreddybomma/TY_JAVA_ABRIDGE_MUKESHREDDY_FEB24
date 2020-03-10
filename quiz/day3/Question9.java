package com.capgemini.quiz.day3;

public class Question9 {
	public  Question9() 
    { 
        System.out.printf("1"); 
        new  Question9(10); 
        System.out.printf("5"); 
    } 
    public  Question9(int temp) 
    { 
        System.out.printf("2"); 
        new  Question9(10, 20); 
        System.out.printf("4"); 
    } 
    public Question9(int data, int temp) 
    { 
        System.out.printf("3"); 
          
    } 
      
    public static void main(String[] args) 
    { 
    	 Question9 obj = new  Question9(); 
          
    } 
      

}

