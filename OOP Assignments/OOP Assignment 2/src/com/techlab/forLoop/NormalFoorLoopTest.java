package com.techlab.forLoop;

public class NormalFoorLoopTest {

	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		//Printing only even elements of array
		for(int i=0; i<arr.length; i++)
		{
			 int a = arr[i]/2*2;
			 if(a == arr[i])
					System.out.print(arr[i] + " ");
		}
		
	}

}
