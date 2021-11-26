//Given an array of positive integers nums and a positive integer target, return
// the minimal length of a contiguous subarray [numsl, numsl+1, ..., numsr-1, nums
//r] of which the sum is greater than or equal to target. If there is no such suba
//rray, return 0 instead. 
//
// 
// Example 1: 
//
// 
//Input: target = 7, nums = [2,3,1,2,4,3]
//Output: 2
//Explanation: The subarray [4,3] has the minimal length under the problem const
//raint.
// 
//
// Example 2: 
//
// 
//Input: target = 4, nums = [1,4,4]
//Output: 1
// 
//
// Example 3: 
//
// 
//Input: target = 11, nums = [1,1,1,1,1,1,1,1]
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// 1 <= target <= 109 
// 1 <= nums.length <= 105 
// 1 <= nums[i] <= 105 
// 
//
// 
//Follow up: If you have figured out the O(n) solution, try coding another solut
//ion of which the time complexity is O(n log(n)). Related Topics Array Binary Sea
//rch Sliding Window Prefix Sum 
// 👍 5100 👎 161

import java.util.logging.Logger;

public class _209_MinimumSizeSubarraySum {
  private static final Logger logger = Logger.getLogger(_209_MinimumSizeSubarraySum.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _209_MinimumSizeSubarraySum().new Solution();
    logger.info("Solution:" + solution.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int left = 0;
      int sum = 0;
      int minLength = nums.length+1;
      if (nums.length == 0 || target <= 0) return 0;
      for (int i = 0; i < nums.length; i++) {
        sum += nums[i];
        while (sum >= target) {
          minLength = Math.min(minLength, i - left + 1);
          sum -= nums[left];
          left++;
        }
      }
      return minLength == nums.length+1 ? 0: minLength;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)
}
