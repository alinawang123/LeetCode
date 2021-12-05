//Reverse bits of a given 32 bits unsigned integer. 
//
// Note: 
//
// 
// Note that in some languages, such as Java, there is no unsigned integer type.
// In this case, both input and output will be given as a signed integer type. The
//y should not affect your implementation, as the integer's internal binary repres
//entation is the same, whether it is signed or unsigned. 
// In Java, the compiler represents the signed integers using 2's complement not
//ation. Therefore, in Example 2 above, the input represents the signed integer -3
// and the output represents the signed integer -1073741825. 
// 
//
// 
// Example 1: 
//
// 
//Input: n = 00000010100101000001111010011100
//Output:    964176192 (00111001011110000010100101000000)
//Explanation: The input binary string 00000010100101000001111010011100 represen
//ts the unsigned integer 43261596, so return 964176192 which its binary represent
//ation is 00111001011110000010100101000000.
// 
//
// Example 2: 
//
// 
//Input: n = 11111111111111111111111111111101
//Output:   3221225471 (10111111111111111111111111111111)
//Explanation: The input binary string 11111111111111111111111111111101 represen
//ts the unsigned integer 4294967293, so return 3221225471 which its binary repres
//entation is 10111111111111111111111111111111.
// 
//
// 
// Constraints: 
//
// 
// The input must be a binary string of length 32 
// 
//
// 
// Follow up: If this function is called many times, how would you optimize it? 
//
// Related Topics Divide and Conquer Bit Manipulation 
// 👍 2417 👎 703

import java.util.logging.Logger;

public class _190_ReverseBits {
  private static final Logger logger = Logger.getLogger(_190_ReverseBits.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _190_ReverseBits().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
      if (n == 0) return 0;
      int res = 0;
      for (int i = 0; i < 32; i++) {
        if ((n & 1) == 1) {
          res <<= 1;
          res += 1;
        } else{
          res<<=1;
        }
        n >>= 1;
      }
      return res;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
