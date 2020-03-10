package com.capgemini.assignment.day3;

public class TestO {
	public static void main(String[] args) {
	ObjectArray[] b=new ObjectArray[2];
	ObjectArray s1=new ObjectArray(1,"mukesh",8096741045l,13.6);
	ObjectArray s2=new ObjectArray(2,"akhila",9999993333l,5.13);
	b[0]=s1;
	b[1]=s2;
	display(b);
}
	static void display(ObjectArray[] n) {
		for(int i=0;i<n.length;i++) {
			System.out.println(n[i].m);
		System.out.println(n[i].x);
		System.out.println(n[i].y);
		System.out.println(n[i].f);
		}
	}}

