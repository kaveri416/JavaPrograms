package com.array.example;

import java.util.Arrays;
public class MovesAllZeroEnd {

	public static void main(String[] args) {

	/*	int[] arr= {1,2,0,4,3,0,5,0};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				int temp=(int) arr[i];
				System.out.println(temp);
				
			}
		}
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==0) {
					System.out.println(arr[j]);
				}
			}*/
		
		
		// int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

	       /* int nonZeroIndex = 0;
	       

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] != 0) {
	                // Swap arr[i] with arr[nonZeroIndex]
	                int temp = arr[nonZeroIndex];
	                arr[nonZeroIndex] = arr[i];
	                arr[i] = temp;
	                nonZeroIndex++;
	            }
	            System.out.println(i);	        }

	        // Print the modified array (optional)
	        for (int val : arr) {
	            System.out.print(val + " ");
	        }
	        System.out.println(); // Newlin*/
		/* int count=0;
	
		 for(int i=0;i<arr.length;i++) {
			 if(arr[i]>0) {
				 arr[count]=arr[i];
				 count++;
			 }
		 }
		
		 while(count<arr.length) {
			 arr[count]=0;
			 count++;
			 
		 }
		
	     //   for(int j=0;j<arr.length;j++) {
	        	System.out.println(Arrays.toString(arr));
	       
		  
		// }  */
		//Remove duplicate elements from array//
		int[]arr= {4,3,4,5,2,9,2,3,4};
		 for(int i=0;i<arr.length;i++) {
			 for(int j=0;j<arr.length-i-1;j++) {
				 if(arr[j]>arr[j+1]) {
					 int temp=arr[j];
					 arr[j]=arr[j+1];
					 arr[j+1]=temp;
					 
				 }
			 }
		 }
		 System.out.println(Arrays.toString(arr));
		 
		 int count=0;
		 int[] result = new int[arr.length];//create new array and store the value
		// int[] result;
		 for(int j=1;j<arr.length;j++) {
			 if(arr[j]!=arr[j-1]) {
				//int temp=arr[j];
				//arr[j]=arr[count];
				//arr[count]=temp;
				//count++;
				 result[count++]=arr[j];
				
			 }
		 }
		// System.out.println();
		 int[] finalResult = Arrays.copyOf(result, count);//create new array with existing
		 System.out.println("Unique Elements: " + Arrays.toString(finalResult));
		//System.out.println(result);
	}

}
