//Write an algorithm to determine if a number n is happy. 
//
// A happy number is a number defined by the following process: 
//
// 
// Starting with any positive integer, replace the number by the sum of the squa
//res of its digits. 
// Repeat the process until the number equals 1 (where it will stay), or it loop
//s endlessly in a cycle which does not include 1. 
// Those numbers for which this process ends in 1 are happy. 
// 
//
// Return true if n is a happy number, and false if not. 
//
// 
// Example 1: 
//
// 
//Input: n = 19
//Output: true
//Explanation:
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1
// 
//
// Example 2: 
//
// 
//Input: n = 2
//Output: false
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 231 - 1 
// 
// Related Topics Hash Table Math Two Pointers 
// 👍 5551 👎 721

import java.util.logging.Logger;

public class _202_HappyNumber {
  private static final Logger logger = Logger.getLogger(_202_HappyNumber.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _202_HappyNumber().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int getNext(int n) {
      int next = 0;
      while (n > 0) {
        int digit = n % 10;
        n = n / 10;
        next += digit * digit;
      }
      return next;
    }

    public boolean isHappy(int n) {
      int slow = n;
      int fast = getNext(n);
      while (fast != 1 && slow != fast) {
        slow = getNext(slow);
        fast = getNext(getNext(fast));
      }
      return fast == 1;

    }
  }

//leetcode submit region end(Prohibit modification and deletion)

}
