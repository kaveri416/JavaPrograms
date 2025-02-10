package com.array.example;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] arr = { 4, 3, 4, 5, 2, 9, 2, 3, 4 };
		//bubble sort 
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}
		//System.out.println(Arrays.toString(arr));// Array sorted
		int count = 0;
		int[] result = new int[arr.length];// create new array and store the value

		for (int j = 1; j < arr.length; j++) {
			if (arr[j] != arr[j - 1]) {
				result[count++] = arr[j];

			}
		}

		int[] finalResult = Arrays.copyOf(result, count);// create new array with existing
		System.out.println("Remove Duplicate Element: " + Arrays.toString(finalResult));
	}

}
