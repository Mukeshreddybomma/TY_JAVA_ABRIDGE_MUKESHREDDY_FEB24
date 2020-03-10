package com.capgemini.assignment.day3;

public class Double1 {
		public static void main(String[] args) {
			double[] numbers= {10.5,20.2,30.5,40.4,50.7};
			printArray(numbers);
			System.out.println("*********");
			double[] nums= getArrayData();
			/* 
			 * for(i=0;i<nums.length;i++) no need to write again we can call by method
			 * because of same data type
			 */
			
			printArray(nums);
		}
		static void printArray(double[]a) {
			for(int i=0;i<a.length;i++) {
				System.out.println(a[i]);
			}
			
		}
		static double[] getArrayData() {
			double[] values = {10.1,20.67,30.77,40.6};
			return values;
		}

		
	}
	


