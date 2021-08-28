//Given an integer array nums, find the contiguous subarray (containing at least
// one number) which has the largest sum and return its sum. 
//
// 
// Example 1: 
//
// 
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
// 
//
// Example 2: 
//
// 
//Input: nums = [1]
//Output: 1
// 
//
// Example 3: 
//
// 
//Input: nums = [5,4,-1,7,8]
//Output: 23
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 3 * 104 
// -105 <= nums[i] <= 105 
// 
//
// 
//Follow up: If you have figured out the O(n) solution, try coding another solut
//ion using the divide and conquer approach, which is more subtle. Related Topics 
//Array Divide and Conquer Dynamic Programming 
// 👍 12094 👎 583

import java.util.Map;
import java.util.logging.Logger;

public class _53_MaximumSubarray {
  private static final Logger logger = Logger.getLogger(_53_MaximumSubarray.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _53_MaximumSubarray().new Solution();
    logger.info("Solution:" + solution.maxSubArray(new int[]{0, 1, 2, 3, 4, 6}));
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int maxSubArray(int[] nums) {
      int maxToCurr = nums[0];
      int max = nums[0];
      for (int i = 1; i < nums.length; i++) {
          maxToCurr = Math.max(maxToCurr+nums[i],nums[i]);
          max= Math.max(maxToCurr,max);
      }
      return max;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
