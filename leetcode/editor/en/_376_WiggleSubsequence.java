//A wiggle sequence is a sequence where the differences between successive numbe
//rs strictly alternate between positive and negative. The first difference (if on
//e exists) may be either positive or negative. A sequence with one element and a 
//sequence with two non-equal elements are trivially wiggle sequences. 
//
// 
// For example, [1, 7, 4, 9, 2, 5] is a wiggle sequence because the differences 
//(6, -3, 5, -7, 3) alternate between positive and negative. 
// In contrast, [1, 4, 7, 2, 5] and [1, 7, 4, 5, 5] are not wiggle sequences. Th
//e first is not because its first two differences are positive, and the second is
// not because its last difference is zero. 
// 
//
// A subsequence is obtained by deleting some elements (possibly zero) from the 
//original sequence, leaving the remaining elements in their original order. 
//
// Given an integer array nums, return the length of the longest wiggle subseque
//nce of nums. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,7,4,9,2,5]
//Output: 6
//Explanation: The entire sequence is a wiggle sequence with differences (6, -3,
// 5, -7, 3).
// 
//
// Example 2: 
//
// 
//Input: nums = [1,17,5,10,13,15,10,5,16,8]
//Output: 7
//Explanation: There are several subsequences that achieve this length.
//One is [1, 17, 10, 13, 10, 16, 8] with differences (16, -7, 3, -3, 6, -8).
// 
//
// Example 3: 
//
// 
//Input: nums = [1,2,3,4,5,6,7,8,9]
//Output: 2
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 1000 
// 0 <= nums[i] <= 1000 
// 
//
// 
// Follow up: Could you solve this in O(n) time? 
// Related Topics Array Dynamic Programming Greedy 
// 👍 2265 👎 85

import java.util.logging.Logger;

public class _376_WiggleSubsequence {
  private static final Logger logger = Logger.getLogger(_376_WiggleSubsequence.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _376_WiggleSubsequence().new Solution();
    int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
    solution.wiggleMaxLength(nums);
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int wiggleMaxLength(int[] nums) {
      if(nums.length<2) return nums.length;
      int k = 0;
      while (k < nums.length - 1 && nums[k] == nums[k + 1]) {  //Skips all the same numbers from series beginning eg 5, 5, 5, 1
        k++;
      }
      if (k == nums.length - 1) {
        return 1;
      }
      int res = 2;
      int up = 0;
      int down = 0;
      for (int i = 1; i < nums.length; i++) {
        if(nums[i] > nums[i - 1]) {
          if(down>=1) {
            res+=1;
            up+=1;
            down=0;
          } else{
            up+=1;
          }
        } else if (nums[i]<nums[i-1]){
          if(up>=1) {
            res+=1;
            down += 1;
            up = 0;
          } else{
            down+=1;
          }
        }
      }
      //System.out.println(res);
      return res;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}