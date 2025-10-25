package ArrayExample;

public class node {

	public static void main(String[] args) {

//int[] arr= {0,3,8,9,5,2};
		/*
		 * for(int i=1;i<arr.length-1;i++) { if(arr[i]>arr[i+1]&&arr[i-1]<arr[i]) {
		 * System.out.println(arr[i]); System.out.println("peak element of array: "+i);
		 * break; } }
		 */

		/*
		 * int start=0; int end=arr.length-1; while(start<end) { int
		 * mid=start+(end-start)/2; if(arr[mid]<arr[mid+1]) {
		 * //System.out.println(arr[mid]); start=mid+1; } else { end=mid; }
		 * 
		 * } System.out.println(arr[start]);
		 */
		int[] arr = { 1, 1, 2, 3, 3, 4, 4, 5, 5 };
		/*
		 * for(int i=1;i<arr.length-1;i++) { if(arr[i]!=arr[i-1]&&arr[i]!=arr[i+1]) {
		 * System.out.println(arr[i]); } }
		 */
		int start = 1;	
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid % 2 == 1)
				mid--;

			if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
				System.out.println(arr[mid]);
				break;
			} else if (arr[mid - 1] == arr[mid - 1]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}

	}

}
