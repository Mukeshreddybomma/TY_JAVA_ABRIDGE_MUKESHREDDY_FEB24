package com.capgemini.quiz.day3;

public class Question7 {
	double overloadedMethod(double d)
    {
        return d *= d;
    }
     
    int overloadedMethod(int i)
    {
        return overloadedMethod(i *= i);
    }
     
    float overloadedMethod(float f)
    {
        return overloadedMethod(f *= f);
    }
     
    public static void main(String[] args)
    {
    	Question7 main = new Question7();
         
        System.out.println(main.overloadedMethod(100));
    }
}

