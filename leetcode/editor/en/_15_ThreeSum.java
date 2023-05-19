//Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k
//]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0. 
//
// Notice that the solution set must not contain duplicate triplets. 
//
// 
// Example 1: 
// Input: nums = [-1,0,1,2,-1,-4]
//Output: [[-1,-1,2],[-1,0,1]]
// Example 2: 
// Input: nums = []
//Output: []
// Example 3: 
// Input: nums = [0]
//Output: []
// 
// 
// Constraints: 
//
// 
// 0 <= nums.length <= 3000 
// -105 <= nums[i] <= 105 
// 
// Related Topics Array Two Pointers Sorting 
// 👍 14580 👎 1402

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collector;

public class _15_ThreeSum {
  private static final Logger logger = Logger.getLogger(_15_ThreeSum.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _15_ThreeSum().new Solution();
    int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
    solution.threeSum(nums);
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      List<List<Integer>> result = new ArrayList<>();
      Arrays.sort(nums);
      for (int i = 0; i < nums.length - 2; i++) {
        if(i>0 && nums[i] == nums[i-1]) continue; //remove duplicates **
        int j = i+1;
        int k = nums.length-1;
        int target = - nums[i]; //target should be put outside of while loop

        while(j < k) {
          if (nums[j] + nums[k] == target) {
            result.add(Arrays.asList(nums[i], nums[j], nums[k]));
            j++;
            k--;
            while (j<k && nums[k] == nums[k+1]) k--; //remove duplicate
            while (j<k && nums[j] == nums[j-1]) j++; //remove duplicate
          }
          if(nums[j] +nums[k] > target) {
            k--;
          }
          if(nums[j] +nums[k] <target) {
            j++;
          }
        }
      }
      return result;
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)


