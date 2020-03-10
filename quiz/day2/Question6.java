package com.capgemini.quiz.day2;

public class Question6 {
	int m_x, m_y;
	   
	  public Question6(int x, int y) { m_x = x; m_y = y; }
	  public Question6() { this(10, 10); }
	  public int getX() { return m_x; }
	  public int getY() { return m_y; }
	   
	  public static void main(String args[]) {
		  Question6 p = new Question6();
	    System.out.println(p.getX());
	  }
	} 
