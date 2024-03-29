//Given an integer array nums, find a contiguous non-empty subarray within the a
//rray that has the largest product, and return the product. 
//
// It is guaranteed that the answer will fit in a 32-bit integer. 
//
// A subarray is a contiguous subsequence of the array. 
//
// 
// Example 1: 
//
// 
//Input: nums = [2,3,-2,4]
//Output: 6
//Explanation: [2,3] has the largest product 6.
// 
//
// Example 2: 
//
// 
//Input: nums = [-2,0,-1]
//Output: 0
//Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 2 * 104 
// -10 <= nums[i] <= 10 
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit 
//integer. 
// 
// Related Topics Array Dynamic Programming 
// 👍 9486 👎 298

import java.util.logging.Logger;

public class _152_MaximumProductSubarray {
  private static final Logger logger = Logger.getLogger(_152_MaximumProductSubarray.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _152_MaximumProductSubarray().new Solution();
    int[] nums = new int[]{0, 2};
    solution.maxProduct(nums);
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int maxProduct(int[] nums) {
      int max = nums[0];
      int maxToCur = nums[0];
      int minToCur = nums[0];
      for (int i = 1; i < nums.length; i++) {
        int temp = maxToCur;
        maxToCur = Math.max(nums[i], Math.max(minToCur * nums[i], maxToCur* nums[i]));
        minToCur = Math.min(nums[i], Math.min(minToCur * nums[i], temp* nums[i]));
        max = Math.max(max, maxToCur);
      }
      return max;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
