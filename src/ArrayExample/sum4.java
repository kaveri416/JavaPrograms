package ArrayExample;
import java.util.*;

 public class sum4 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int start = j + 1;
                int end = n - 1;

                while (start < end) {
                    long sum = (long) nums[i] + nums[j] + nums[start] + nums[end]; // prevent integer overflow

                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));

                        
                        while (start < end && nums[start] == nums[start + 1]) start++;
                        while (start < end && nums[end] == nums[end - 1]) end--;

                        start++;
                        end--;
                    } 
                    else if (sum < target) {
                        start++;
                    } 
                    else {
                        end--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
       sum4 sol = new sum4();
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.println(sol.fourSum(nums, target));
    }
}
