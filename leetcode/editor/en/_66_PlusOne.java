//Given a non-empty array of decimal digits representing a non-negative integer,
// increment one to the integer. 
//
// The digits are stored such that the most significant digit is at the head of 
//the list, and each element in the array contains a single digit. 
//
// You may assume the integer does not contain any leading zero, except the numb
//er 0 itself. 
//
// 
// Example 1: 
//
// 
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
// 
//
// Example 2: 
//
// 
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
// 
//
// Example 3: 
//
// 
//Input: digits = [0]
//Output: [1]
// 
//
// 
// Constraints: 
//
// 
// 1 <= digits.length <= 100 
// 0 <= digits[i] <= 9 
// 
// Related Topics Array Math 
// 👍 2805 👎 3606

import java.util.logging.Logger;

public class _66_PlusOne {
  private static final Logger logger = Logger.getLogger(_66_PlusOne.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _66_PlusOne().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int[] plusOne(int[] digits) {
      int n = digits.length;
      for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
          digits[i]++;
          return digits;
        }
        digits[i] = 0;
      }
      int[] newNumber = new int [n+1];
      newNumber[0] = 1;
      return newNumber;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
