
package com.array.example;

public class FindSecondLargestNumber {
	public static void main(String[] args) {
		int arr[] = { 11, 15, 19, 21, 24, 101 };
		System.out.println(secondLargest(arr));
	}

	static int secondLargest(int arr[]) {
		int secondlargest = -1;
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > secondlargest && arr[i] != max) {
				secondlargest = arr[i];
			}
		}
		return secondlargest;
	}
}
