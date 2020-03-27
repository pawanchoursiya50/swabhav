package com.techlab.arguments;

public class ArrayToFunctionTest {

	public static void main(String[] args) {
		
		double[] cgpaList = {4.5, 3.4, 7.5, 8.6, 7.9};
		
		updateCGPA(cgpaList);
		
		for(double cgpa : cgpaList) {
			System.out.println(cgpa);
		}
	}

	private static void updateCGPA(double[] cgpaNewList) {
		
		for(int i=0; i<cgpaNewList.length; i++)
		{
			cgpaNewList[i] += 1;
		}
	}

}
