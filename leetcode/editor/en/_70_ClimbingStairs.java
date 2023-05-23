//You are climbing a staircase. It takes n steps to reach the top. 
//
// Each time you can either climb 1 or 2 steps. In how many distinct ways can yo
//u climb to the top? 
//
// 
// Example 1: 
//
// 
//Input: n = 2
//Output: 2
//Explanation: There are two ways to climb to the top.
//1. 1 step + 1 step
//2. 2 steps
// 
//
// Example 2: 
//
// 
//Input: n = 3
//Output: 3
//Explanation: There are three ways to climb to the top.
//1. 1 step + 1 step + 1 step
//2. 1 step + 2 steps
//3. 2 steps + 1 step
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 45 
// 
// Related Topics Math Dynamic Programming Memoization 
// 👍 7841 👎 234

import java.util.logging.Logger;

public class _70_ClimbingStairs {
  private static final Logger logger = Logger.getLogger(_70_ClimbingStairs.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _70_ClimbingStairs().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int climbStairs(int n) {
     if(n==1) return 1; //must keep java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
     if(n==2) return 2; //must keep out of bounds exception
     int[] dp = new int[n+1];
     dp[0] = 0;
     dp[1] = 1;
     dp[2] = 2;
     for (int i = 3; i <= n; i++) { //i <= n
        dp[i] = dp[i-1] + dp[i-2];
      }
     return dp[n];
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)


