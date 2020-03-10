package com.capgemini.assignment.day3;

public class Long1 {
	public static void main(String[] args) {
		long[] num= {8096741045l,9951084580l,9491381271l};
		printvalues(num);
		System.out.println("*************");
		long[] numbers=getsvalues();
		printvalues(numbers);
		
				
	}
		static void printvalues(long[] a) {
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			}
		
	}
		static long[] getsvalues() {
			long[] values = {9999999999l,111111111l,110000001l};
			return values;
			
		}

		
}
