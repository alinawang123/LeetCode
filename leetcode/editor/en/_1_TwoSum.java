package editor.en;

//Given an array of integers nums and an integer target, return indices of the t
//wo numbers such that they add up to target. 
//
// You may assume that each input would have exactly one solution, and you may n
//ot use the same element twice. 
//
// You can return the answer in any order. 
//
// 
// Example 1: 
//
// 
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Output: Because nums[0] + nums[1] == 9, we return [0, 1].
// 
//
// Example 2: 
//
// 
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
// 
//
// Example 3: 
//
// 
//Input: nums = [3,3], target = 6
//Output: [0,1]
// 
//
// 
// Constraints: 
//
// 
// 2 <= nums.length <= 103 
// -109 <= nums[i] <= 109 
// -109 <= target <= 109 
// Only one valid answer exists. 
// 
// Related Topics Array Hash Table 
// 👍 20536 👎 722

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;


public class _1_TwoSum {
  private static final Logger logger = Logger.getLogger(_1_TwoSum.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _1_TwoSum().new Solution();
    assertEquals();
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> numMap = new HashMap<>();
      for (int i = 0; i < nums.length; i++) {
        numMap.put(i, nums[i]);
      }
      for (int i = 0; i < nums.length; i++) {
        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
          if (entry.getValue() == target - nums[i] && entry.getKey()!= i) {
            return new int[]{i, entry.getKey()};
          }
        }
      }
      return null;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
