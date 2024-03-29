//A message containing letters from A-Z can be encoded into numbers using the fo
//llowing mapping: 
//
// 
//'A' -> "1"
//'B' -> "2"
//...
//'Z' -> "26"
// 
//
// To decode an encoded message, all the digits must be grouped then mapped back
// into letters using the reverse of the mapping above (there may be multiple ways
//). For example, "11106" can be mapped into: 
//
// 
// "AAJF" with the grouping (1 1 10 6) 
// "KJF" with the grouping (11 10 6) 
// 
//
// Note that the grouping (1 11 06) is invalid because "06" cannot be mapped int
//o 'F' since "6" is different from "06". 
//
// Given a string s containing only digits, return the number of ways to decode 
//it. 
//
// The answer is guaranteed to fit in a 32-bit integer. 
//
// 
// Example 1: 
//
// 
//Input: s = "12"
//Output: 2
//Explanation: "12" could be decoded as "AB" (1 2) or "L" (12).
// 
//
// Example 2: 
//
// 
//Input: s = "226"
//Output: 3
//Explanation: "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2
// 6).
// 
//
// Example 3: 
//
// 
//Input: s = "0"
//Output: 0
//Explanation: There is no character that is mapped to a number starting with 0.
//
//The only valid mappings with 0 are 'J' -> "10" and 'T' -> "20", neither of whi
//ch start with 0.
//Hence, there are no valid ways to decode this since all digits need to be mapp
//ed.
// 
//
// Example 4: 
//
// 
//Input: s = "06"
//Output: 0
//Explanation: "06" cannot be mapped to "F" because of the leading zero ("6" is 
//different from "06").
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 100 
// s contains only digits and may contain leading zero(s). 
// 
// Related Topics String Dynamic Programming 
// 👍 5261 👎 3578

import java.util.logging.Logger;

public class _91_DecodeWays {
  private static final Logger logger = Logger.getLogger(_91_DecodeWays.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _91_DecodeWays().new Solution();
    String s = "01";
    System.out.println(solution.numDecodings(s));
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int numDecodings(String s) {
      int[] dp = new int[s.length()+1];
      if(s.charAt(0) == '0') return 0;
      dp[0] = 1;
      dp[1] = 1;
      for (int i = 2; i <= s.length(); i++) {
        int first = Integer.parseInt(s.substring(i-1,i));
        int second = Integer.parseInt(s.substring(i-2,i));
        if(1<=first && first <= 9) {
          dp[i] = dp[i] + dp[i-1];
        }
        if(10 <= second && second <= 26) {
          dp[i] = dp[i] + dp[i-2];
        }
      }
      return dp[s.length()];
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
