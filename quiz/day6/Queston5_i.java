package com.capgemini.quiz.day6;

public class Queston5_i  {
	Question5 op;// aggregation
	double pi = 3.14;

	double area(int radius) {
		op = new Question5();
		int rsquare = op.square(radius);// code reusability.
		return pi * rsquare;
	}

}
