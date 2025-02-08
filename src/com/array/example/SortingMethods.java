package com.array.example;

import java.util.Arrays;

public class SortingMethods {

	public int[] bubblesort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
		return arr;
	}

	public int[] insertionsort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j;
			for (j = i - 1; j >= 0 && arr[j] > key; j--) {

				arr[j + 1] = arr[j];

			}
			arr[j + 1] = key;

		}

		return arr;
	}
	

	public static void main(String[] args) {
		int[] arr = { 56, 78, 90, 13, 79, 80 };
		SortingMethods obj2 = new SortingMethods();
		int result[] = obj2.insertionsort(arr);
		System.out.println(Arrays.toString(result));

		SortingMethods obj1 = new SortingMethods();
		int result1[] = obj1.bubblesort(arr);
		System.out.println(Arrays.toString(result1));

	}

}
