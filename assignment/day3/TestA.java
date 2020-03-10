package com.capgemini.assignment.day3;

public class TestA {
public static void main(String[] args) {
	Items[] i= new Items[4];
	Items s1= new Items("nike","umbro","Denim");
	Items s2= new Items("puma","Jockey","shades");
	Items s3= new Items("addidas","polo","bull");
	Items s4= new Items("woodland","killer","pepe");
	i[0]=s1;
	i[1]=s2;
	i[2]=s3;
	i[3]=s4;
	printItemsDetails(i);
	Items[] stu =getItems();
	printItemsDetails(stu);
}
static void printItemsDetails(Items[] stu) {
	for(int i=0;i<stu.length;i++) {
		System.out.println("Name-"+stu[i].Shoes);
		System.out.println("id-"+stu[i].shirts);
		System.out.println("percentage-"+stu[i].pants);
		System.out.println("***************");
	}}
		static Items[] getItems() {
			Items[] i= new Items[4];
			Items s1= new Items("nike","umbro","Denim");
			Items s2= new Items("puma","Jockey","shades");
			Items s3= new Items("addidas","polo","bull");
			Items s4= new Items("woodland","killer","pepe");
			
		i[0]=s1;
		i[1]=s2;
		i[2]=s3;
		i[3]=s4;
		return i; 
}}