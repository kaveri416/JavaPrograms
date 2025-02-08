package com.array.example;

public class LinearSearch {

	public int linear(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				return i;
			}
		}
		return -1;

	}

	public int binarysearch(int[] arr1, int n) {
		int first = 0;
		int last = arr1.length - 1;
		while (first <= last) {
			int mid = first + (last - first) / 2;
			if (arr1[mid] < n) {
				first = mid + 1;

			} else if (arr1[mid] > n) {
				last = mid - 1;
			} else {

				return mid;
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 56, 40, 23, 12, 35, 98, 67, 20 };
		int[] arr1 = { 10, 20, 25, 30, 35, 40 };
		int n = 40;
		LinearSearch obj = new LinearSearch();
		int result1 = obj.binarysearch(arr1, n);
		int result = obj.linear(arr, n);
		System.out.println("binary search");
		System.out.println(" number found at position : " + result1);
		System.out.println("linear search");
		System.out.println(" number found at position: " + result);

	}

}
