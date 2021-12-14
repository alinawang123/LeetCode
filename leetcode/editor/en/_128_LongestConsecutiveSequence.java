//Given an unsorted array of integers nums, return the length of the longest con
//secutive elements sequence. 
//
// You must write an algorithm that runs in O(n) time. 
//
// 
// Example 1: 
//
// 
//Input: nums = [100,4,200,1,3,2]
//Output: 4
//Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Theref
//ore its length is 4.
// 
//
// Example 2: 
//
// 
//Input: nums = [0,3,7,2,5,8,4,6,0,1]
//Output: 9
// 
//
// 
// Constraints: 
//
// 
// 0 <= nums.length <= 105 
// -109 <= nums[i] <= 109 
// 
// Related Topics Array Hash Table Union Find 
// 👍 7609 👎 350

import java.util.HashSet;
import java.util.logging.Logger;

public class _128_LongestConsecutiveSequence {
  private static final Logger logger = Logger.getLogger(_128_LongestConsecutiveSequence.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _128_LongestConsecutiveSequence().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int longestConsecutive(int[] nums) {
      if (nums.length == 0) return 0;

      HashSet<Integer> set = new HashSet<>();
      for (int i = 0; i < nums.length; i++) {
        set.add(nums[i]);
      }

      int sequenceLength = 0;
      int longestSequence = 0;
      int curNum = 0;

      for (int num : nums) {
        if (!set.contains(num - 1)) {
          curNum = num;
          sequenceLength = 1;

          while (set.contains(curNum + 1)) { //looking for the beginning of the sequence
            curNum++;
            sequenceLength++;
          }
        }
        longestSequence = Math.max(longestSequence, sequenceLength);
      }
      return longestSequence;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
