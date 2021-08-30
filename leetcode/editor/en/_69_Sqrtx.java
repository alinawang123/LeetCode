//Given a non-negative integer x, compute and return the square root of x. 
//
// Since the return type is an integer, the decimal digits are truncated, and on
//ly the integer part of the result is returned. 
//
// Note: You are not allowed to use any built-in exponent function or operator, 
//such as pow(x, 0.5) or x ** 0.5. 
//
// 
// Example 1: 
//
// 
//Input: x = 4
//Output: 2
// 
//
// Example 2: 
//
// 
//Input: x = 8
//Output: 2
//Explanation: The square root of 8 is 2.82842..., and since the decimal part is
// truncated, 2 is returned. 
//
// 
// Constraints: 
//
// 
// 0 <= x <= 231 - 1 
// 
// Related Topics Math Binary Search 
// 👍 2457 👎 2595

import java.util.logging.Logger;

public class _69_Sqrtx {
  private static final Logger logger = Logger.getLogger(_69_Sqrtx.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _69_Sqrtx().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int mySqrt(int x) {
      if (x == 0)
        return 0;
      int left = 1, right = Integer.MAX_VALUE;
      while (true) {
        int mid = left + (right - left) / 2;
        if (mid > x / mid) {
          right = mid - 1;
        } else {
          if (mid + 1 > x / (mid + 1))
            return mid;
          left = mid + 1;
        }
      }
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
