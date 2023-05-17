//Given an integer array nums, return an array answer such that answer[i] is equ
//al to the product of all the elements of nums except nums[i]. 
//
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit 
//integer. 
//
// You must write an algorithm that runs in O(n) time and without using the divi
//sion operation. 
//
// 
// Example 1: 
// Input: nums = [1,2,3,4]
//Output: [24,12,8,6]
// Example 2: 
// Input: nums = [-1,1,0,-3,3]
//Output: [0,0,9,0,0]
// 
// 
// Constraints: 
//
// 
// 2 <= nums.length <= 105 
// -30 <= nums[i] <= 30 
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit 
//integer. 
// 
//
// 
// Follow up: Can you solve the problem in O(1) extra space complexity? (The out
//put array does not count as extra space for space complexity analysis.) 
// Related Topics Array Prefix Sum 
// 👍 10179 👎 648

import java.util.logging.Logger;

public class _238_ProductOfArrayExceptSelf {
  private static final Logger logger = Logger.getLogger(_238_ProductOfArrayExceptSelf.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _238_ProductOfArrayExceptSelf().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int[] productExceptSelf(int[] nums) {
      int[] result = new int[nums.length];
      result[0] = 1;
      for (int i = 1; i < nums.length; i++) {
        result[i] = result[i-1]*nums[i-1];
      }
      int right = 1;
      for (int i = nums.length-1; i >= 0 ; i--) {
        result[i] *= right;
        right *= nums[i];
      }
      return result;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
