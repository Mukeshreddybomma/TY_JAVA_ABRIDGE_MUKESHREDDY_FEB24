package com.capgemini.quiz.day5;

public class Test9 extends Question9 {
	void display(){
        String n = myName();
    System.out.print("My name is "+ n);
  }

  public static void main(String args[]){
	  Test9 t = new Test9();
    t.display();
  }

}
