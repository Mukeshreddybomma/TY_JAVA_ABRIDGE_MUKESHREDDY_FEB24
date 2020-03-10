package com.capgemini.quiz.day5;

public class Question4 {
	static{
        System.out.println("static");
  }

  {
        System.out.println("block");
  }

  public Question4 (){
        System.out.println("A");
  }

  public static void main(String[] args){
	  Question4 a = new Question4();
  }

}
