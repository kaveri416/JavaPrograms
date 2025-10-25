package ArrayExample;

import java.util.*;

 public class ThreeSum {
  
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int closest = nums[0] + nums[1] + nums[2]; // initial sum

        for (int i = 0; i < n - 2; i++) {
            int start = i + 1;
            int end = n - 1;

            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];

                // check if this sum is closer to target
                if (Math.abs(sum - target) < Math.abs(closest - target)) {
                    closest = sum;
                }

                if (sum < target) {
                    start++;
                } else if (sum > target) {
                    end--;
                } else {
                    // exact match
                    return sum;
                }
            }
        }

        return closest;
    }

    public static void main(String[] args) {
    	 ThreeSum sol = new ThreeSum();
        int[] nums1 = {-1, 2, 1, -4};
        int target1 = 1;
        System.out.println(sol.threeSumClosest(nums1, target1)); // Output: 2

        int[] nums2 = {0, 0, 0};
        int target2 = 1;
        System.out.println(sol.threeSumClosest(nums2, target2)); // Output: 0
    }
}
