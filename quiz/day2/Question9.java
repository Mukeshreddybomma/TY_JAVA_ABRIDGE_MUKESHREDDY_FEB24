package com.capgemini.quiz.day2;

public class Question9 {
	int a = 1;
    int b = 2;
 
    Question9 func(Question9 obj)
    {
    	Question9 obj3 = new Question9();
        obj3 = obj;
        obj3.a = obj.a++ + ++obj.b;
        obj.b = obj.b;
        return obj3;
    }
 
    public static void main(String[] args)
    {
    	Question9 obj1 = new Question9();
    	Question9 obj2 = obj1.func(obj1);
 
        System.out.println("obj1.a = " + obj1.a + "  obj1.b = " + obj1.b);
        System.out.println("obj2.a = " + obj2.a + "  obj1.b = " + obj2.b);
 
    }

}
