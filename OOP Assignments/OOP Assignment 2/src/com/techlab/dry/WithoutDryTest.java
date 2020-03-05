package com.techlab.dry;

public class WithoutDryTest {

	public static void main(String[] args) {
		int[] arr = {2,6,7,8,2,4,6,8,2,4};
		int temp;
		//Array without sort
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
		
		//Sorting the Array
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-1-i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		//Array after sort
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

}
