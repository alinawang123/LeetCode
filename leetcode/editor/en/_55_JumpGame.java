//You are given an integer array nums. You are initially positioned at the array
//'s first index, and each element in the array represents your maximum jump lengt
//h at that position. 
//
// Return true if you can reach the last index, or false otherwise. 
//
// 
// Example 1: 
//
// 
//Input: nums = [2,3,1,1,4]
//Output: true
//Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
// 
//
// Example 2: 
//
// 
//Input: nums = [3,2,1,0,4]
//Output: false
//Explanation: You will always arrive at index 3 no matter what. Its maximum jum
//p length is 0, which makes it impossible to reach the last index.
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 104 
// 0 <= nums[i] <= 105 
// 
// Related Topics Array Dynamic Programming Greedy 
// 👍 8896 👎 524

import java.util.logging.Logger;

public class _55_JumpGame {
  private static final Logger logger = Logger.getLogger(_55_JumpGame.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _55_JumpGame().new Solution();
    int[] nums = new int[]{2, 3, 1, 1, 4};
    System.out.println(solution.canJump(nums));
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public boolean canJump(int[] nums) {
      int curEnd = 0;
      int curFarthest = 0;
      for (int i = 0; i < nums.length; i++) {
        curFarthest = Math.max(curFarthest, i + nums[i]);
        if (i == curEnd) {
          curEnd = curFarthest;
        }
      }
      if (curEnd < nums.length-1) {
        return false;
      } else {
        return true;
      }
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
