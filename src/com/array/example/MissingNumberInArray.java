
package com.array.example;

public class MissingNumberInArray {
	// rules for the missing numbers
	// Arrays should not contain nay duplicate value
	// Arrays no need to be in sorted order
	// the values should be in proper range
	// 1+2+3+4+5 = 15 sum1 but when 3 is missing it will give 1+2+4+5=12 sum2

	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5 };
		int sum1 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum1 = sum1 + arr[i];
		}
		System.out.println(sum1);
		int sum2 = 0;
		for (int i = 0; i <= 5; i++) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
		System.out.println("The Missing number is = " + (sum2 - sum1));
	}
}
