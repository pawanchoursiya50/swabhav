package com.techlab.forLoop;

public class EnhancedForLoopTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		//Printing only even elements of array
		for(int element : arr)
		{
			 if(element % 2 == 0)
					System.out.print(element + " ");
		}
	}

}
