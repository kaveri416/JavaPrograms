package ArrayExample;
public class ArrayProblems {

	//public static void main(String[] args) {
		/*int[] arr1= {1,3,5,6};
		int[] arr2= {2,4,7,8,9};
		int[] result=new int[arr1.length+arr2.length];
		int i=0; int j=0;
		int k=0;
		while(i<arr1.length&&j<arr2.length) {
			 if(arr1[i]<arr2[j]) {
				 result[k++]=arr1[i];
				 i++;
			 }else {
				 result[k++]=arr2[j];
				 j++;
			 }
			 
		}
		while(i<arr1.length) {
			result[k++]=arr1[i];
			i++;
		}
		while(j<arr2.length) {
			result[k++]=arr2[j];
			j++;
		}
		for(int a=0;a<result.length;a++) {
			System.out.println(result[a]);
		}*/
		/*int [] arr= {1,2,3,4};
		int sum=1;
		for(int i=0;i<arr.length;i++) {
			sum=1;
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					continue;
				}
				sum=arr[j]*sum;
			}
			System.out.println(sum);

			
		}*/
		/*nt[] arr= {1,2,3,4};
		int[] ans=new int[arr.length];

		ans[0] = 1; 

		int i;
		for(i=1;i<arr.length;i++) {
			ans[i]=ans[i-1]*arr[i-1];
		}
		int suff=1;
		for(int j=arr.length-1;j>=0;j--) {
			 ans[j] = ans[j] * suff;
	            suff = suff * arr[j];
		}
		for(int a=0;a<arr.length;a++) {
		System.out.println(ans[a]);
		}*/
	
		
		//class Main {
		    // Recursive method to calculate sum from i to 5
		    public int sum(int i) {
		        int n = 5;

		        // Base case: when i == n
		        if (i == n) {
		            return n; // return 5
		        }

		        // Recursive case: add current number and call next
		        return i + sum(i + 1);
		    }

		    public static void main(String[] args) {
		       ArrayProblems m1 = new ArrayProblems();
		        int result = m1.sum(0);
		        System.out.println("Sum from 1 to 5 is: " + result);
		    }
		}

		


