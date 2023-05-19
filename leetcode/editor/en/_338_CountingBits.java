//Given an integer n, return an array ans of length n + 1 such that for each i (
//0 <= i <= n), ans[i] is the number of 1's in the binary representation of i. 
//
// 
// Example 1: 
//
// 
//Input: n = 2
//Output: [0,1,1]
//Explanation:
//0 --> 0
//1 --> 1
//2 --> 10
// 
//
// Example 2: 
//
// 
//Input: n = 5
//Output: [0,1,1,2,1,2]
//Explanation:
//0 --> 0
//1 --> 1
//2 --> 10
//3 --> 11
//4 --> 100
//5 --> 101
// 
//
// 
// Constraints: 
//
// 
// 0 <= n <= 105 
// 
//
// 
// Follow up: 
//
// 
// It is very easy to come up with a solution with a runtime of O(n log n). Can 
//you do it in linear time O(n) and possibly in a single pass? 
// Can you do it without using any built-in function (i.e., like __builtin_popco
//unt in C++)? 
// 
// Related Topics Dynamic Programming Bit Manipulation 
// 👍 5181 👎 257

import java.util.logging.Logger;

public class _338_CountingBits {
  private static final Logger logger = Logger.getLogger(_338_CountingBits.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _338_CountingBits().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int[] countBits(int n) {
      int[] ans = new int[n+1];
      ans[0] = 0;
      for (int i = 1; i < n+1; i++) {
        ans[i] = ans[i>>1] + (i&1);
      }
      return ans;
    }




  }
}
//leetcode submit region end(Prohibit modification and deletion)


