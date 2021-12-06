//You are a professional robber planning to rob houses along a street. Each hous
//e has a certain amount of money stashed. All houses at this place are arranged i
//n a circle. That means the first house is the neighbor of the last one. Meanwhil
//e, adjacent houses have a security system connected, and it will automatically c
//ontact the police if two adjacent houses were broken into on the same night. 
//
// Given an integer array nums representing the amount of money of each house, r
//eturn the maximum amount of money you can rob tonight without alerting the polic
//e. 
//
// 
// Example 1: 
//
// 
//Input: nums = [2,3,2]
//Output: 3
//Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 
//2), because they are adjacent houses.
// 
//
// Example 2: 
//
// 
//Input: nums = [1,2,3,1]
//Output: 4
//Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
//Total amount you can rob = 1 + 3 = 4.
// 
//
// Example 3: 
//
// 
//Input: nums = [1,2,3]
//Output: 3
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 100 
// 0 <= nums[i] <= 1000 
// 
// Related Topics Array Dynamic Programming 
// 👍 4225 👎 74

import java.util.logging.Logger;

public class _213_HouseRobberIi {
  private static final Logger logger = Logger.getLogger(_213_HouseRobberIi.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _213_HouseRobberIi().new Solution();
    int[] nums = new int[]{ 2, 3, 2};
    System.out.println(solution.rob(nums));
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int rob(int[] nums) {
      if (nums.length == 1) return nums[0];
      return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }

    public int rob(int[] nums, int low, int high) {
      if (high == low) return nums[low];
      if (high - low == 1) return Math.max(nums[low], nums[high]);
      int[] dp = new int[high - low + 2];
      dp[0] = 0;
      dp[1] = nums[low];
      for (int i = 1; i < high-low+1; i++) {
        dp[i + 1] = Math.max(dp[i - 1] + nums[i+low], dp[i]);
      }
      return dp[high - low + 1];
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
