//The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibon
//acci sequence, such that each number is the sum of the two preceding ones, start
//ing from 0 and 1. That is, 
//
// 
//F(0) = 0, F(1) = 1
//F(n) = F(n - 1) + F(n - 2), for n > 1.
// 
//
// Given n, calculate F(n). 
//
// 
// Example 1: 
//
// 
//Input: n = 2
//Output: 1
//Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
// 
//
// Example 2: 
//
// 
//Input: n = 3
//Output: 2
//Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
// 
//
// Example 3: 
//
// 
//Input: n = 4
//Output: 3
//Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
// 
//
// 
// Constraints: 
//
// 
// 0 <= n <= 30 
// 
// Related Topics Math Dynamic Programming Recursion Memoization 
// 👍 1802 👎 236

import java.util.logging.Logger;

public class _509_FibonacciNumber {
  private static final Logger logger = Logger.getLogger(_509_FibonacciNumber.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _509_FibonacciNumber().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int fib(int n) {
      if (n <= 1) return n;
      int a = 0;
      int b = 1;
      int sum = 0;
      for (int i = 2; i <= n; i++) {
        sum = a + b;
        a = b;
        b = sum;
      }
      return sum;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
