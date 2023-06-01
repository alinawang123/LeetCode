//A robot is located at the top-left corner of a m x n grid (marked 'Start' in t
//he diagram below). 
//
// The robot can only move either down or right at any point in time. The robot 
//is trying to reach the bottom-right corner of the grid (marked 'Finish' in the d
//iagram below). 
//
// How many possible unique paths are there? 
//
// 
// Example 1: 
//
// 
//Input: m = 3, n = 7
//Output: 28
// 
//
// Example 2: 
//
// 
//Input: m = 3, n = 2
//Output: 3
//Explanation:
//From the top-left corner, there are a total of 3 ways to reach the bottom-righ
//t corner:
//1. Right -> Down -> Down
//2. Down -> Down -> Right
//3. Down -> Right -> Down
// 
//
// Example 3: 
//
// 
//Input: m = 7, n = 3
//Output: 28
// 
//
// Example 4: 
//
// 
//Input: m = 3, n = 3
//Output: 6
// 
//
// 
// Constraints: 
//
// 
// 1 <= m, n <= 100 
// It's guaranteed that the answer will be less than or equal to 2 * 109. 
// 
// Related Topics Math Dynamic Programming Combinatorics 
// 👍 6197 👎 258

import java.util.logging.Logger;

public class _62_UniquePaths {
  private static final Logger logger = Logger.getLogger(_62_UniquePaths.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _62_UniquePaths().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int uniquePaths(int m, int n) {
      int[][] dp = new int[m][n];
      for (int i = 0; i < m; i++) {
        dp[i][0] = 1;
      }
      for (int j = 0; j < n; j++) {
        dp[0][j] = 1;

      }
      for (int i = 0; i < m-1; i++) {
        for (int j = 0; j < n-1; j++) {
          dp[i+1][j+1] = dp[i][j+1]+dp[i+1][j];
        }

      }
      return dp[m-1][n-1];
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}