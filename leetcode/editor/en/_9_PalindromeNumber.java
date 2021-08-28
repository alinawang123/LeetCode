//Given an integer x, return true if x is palindrome integer. 
//
// An integer is a palindrome when it reads the same backward as forward. For ex
//ample, 121 is palindrome while 123 is not. 
//
// 
// Example 1: 
//
// 
//Input: x = 121
//Output: true
// 
//
// Example 2: 
//
// 
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes
// 121-. Therefore it is not a palindrome.
// 
//
// Example 3: 
//
// 
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
// 
//
// Example 4: 
//
// 
//Input: x = -101
//Output: false
// 
//
// 
// Constraints: 
//
// 
// -231 <= x <= 231 - 1 
// 
//
// 
//Follow up: Could you solve it without converting the integer to a string? Rela
//ted Topics Math 
// 👍 3859 👎 1838

import java.util.logging.Logger;

public class _9_PalindromeNumber {
  private static final Logger logger = Logger.getLogger(_9_PalindromeNumber.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _9_PalindromeNumber().new Solution();
    logger.info("Solution:" + solution.isPalindrome(121));
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public boolean isPalindrome(int x) {
      if (x < 0) return false;
      int y = 0;
      while (x > y) {
        y = x % 10 + 10 * y;
        x = x / 10;
      }
      return x == y || x == y/10;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
