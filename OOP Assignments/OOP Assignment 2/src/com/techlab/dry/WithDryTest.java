package com.techlab.dry;

public class WithDryTest {

	int[] arr = { 2, 6, 7, 8, 2, 4, 6, 8, 2, 4 };

	public static void main(String[] args) {

		WithDryTest dryObj = new WithDryTest();

		// Array without sort
		dryObj.printArray();

		// Sorting the Array
		dryObj.sortArray();

		// Array after sort
		dryObj.printArray();

	}

	public void printArray() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void sortArray() {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
