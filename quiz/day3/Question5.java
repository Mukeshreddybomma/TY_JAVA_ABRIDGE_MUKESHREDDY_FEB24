package com.capgemini.quiz.day3;

public class Question5 {
	{
	    final void m1() 
	    {
	        System.out.println("This is a final method.");
	    }
	}

	class B extends Question5
	{
	    void m1()
	    { 
	        // ERROR! Can't override.
	        System.out.println("Illegal!");
	    }
	}

}
