//Given n non-negative integers representing an elevation map where the width of
// each bar is 1, compute how much water it can trap after raining. 
//
// 
// Example 1: 
//
// 
//Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
//Output: 6
//Explanation: The above elevation map (black section) is represented by array [
//0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are
// being trapped.
// 
//
// Example 2: 
//
// 
//Input: height = [4,2,0,3,2,5]
//Output: 9
// 
//
// 
// Constraints: 
//
// 
// n == height.length 
// 1 <= n <= 2 * 104 
// 0 <= height[i] <= 105 
// 
// Related Topics Array Two Pointers Dynamic Programming Stack Monotonic Stack 
// 👍 15182 👎 216

import java.util.Map;
import java.util.logging.Logger;

public class _42_TrappingRainWater {
  private static final Logger logger = Logger.getLogger(_42_TrappingRainWater.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _42_TrappingRainWater().new Solution();
    logger.info("Solution:" + solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int trap(int[] height) {
      int left = 0;
      int right = height.length - 1;
      int maxLeft = height[left];
      int maxRight = height[right];
      int maxWater = 0;
      while (left < right) {
        if (maxLeft < maxRight) {
          maxWater += maxLeft - height[left];
          maxLeft = Math.max(maxLeft, height[left++]);
        } else {
          maxWater+= maxRight-height[right];
          maxRight=Math.max(maxRight, height[right--]);
        }
      }
    return maxWater;
  }


        return maxWater;

}
}
//leetcode submit region end(Prohibit modification and deletion)

    }
