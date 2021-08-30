//Given two binary strings a and b, return their sum as a binary string. 
//
// 
// Example 1: 
// Input: a = "11", b = "1"
//Output: "100"
// Example 2: 
// Input: a = "1010", b = "1011"
//Output: "10101"
// 
// 
// Constraints: 
//
// 
// 1 <= a.length, b.length <= 104 
// a and b consist only of '0' or '1' characters. 
// Each string does not contain leading zeros except for the zero itself. 
// 
// Related Topics Math String Bit Manipulation Simulation 
// 👍 3293 👎 392

import java.util.logging.Logger;

public class _67_AddBinary {
  private static final Logger logger = Logger.getLogger(_67_AddBinary.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _67_AddBinary().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public String addBinary(String a, String b) {
      StringBuilder sb = new StringBuilder();
      int i = a.length() - 1, j = b.length() - 1, carry = 0;
      while (i >= 0 || j >= 0) {
        int sum = carry;
        if (j >= 0) sum += b.charAt(j--) - '0';
        if (i >= 0) sum += a.charAt(i--) - '0';
        sb.append(sum % 2);
        carry = sum / 2;
      }
      if (carry != 0) sb.append(carry);
      return sb.reverse().toString();
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
