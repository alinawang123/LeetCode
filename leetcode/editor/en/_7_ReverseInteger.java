//Given a signed 32-bit integer x, return x with its digits reversed. If reversi
//ng x causes the value to go outside the signed 32-bit integer range [-231, 231 -
// 1], then return 0. 
//
// Assume the environment does not allow you to store 64-bit integers (signed or
// unsigned). 
//
// 
// Example 1: 
// Input: x = 123
//Output: 321
// Example 2: 
// Input: x = -123
//Output: -321
// Example 3: 
// Input: x = 120
//Output: 21
// Example 4: 
// Input: x = 0
//Output: 0
// 
// 
// Constraints: 
//
// 
// -231 <= x <= 231 - 1 
// 
// Related Topics Math 
// 👍 5515 👎 8229

import java.util.Arrays;
import java.util.logging.Logger;

public class _7_ReverseInteger {
  private static final Logger logger = Logger.getLogger(_7_ReverseInteger.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _7_ReverseInteger().new Solution();
    logger.info("Solution:" + solution.reverse(1534236469));
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int reverse(int x) {
      long y = 0;
      while (x != 0) {
        y = x % 10 + 10 * y;
        x = x / 10;
        if (y > Integer.MAX_VALUE || y < Integer.MIN_VALUE) return 0;
      }
      return (int) y;
    }
  }
}
