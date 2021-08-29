//Write a function to find the longest common prefix string amongst an array of 
//strings. 
//
// If there is no common prefix, return an empty string "". 
//
// 
// Example 1: 
//
// 
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
// 
//
// Example 2: 
//
// 
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
// 
//
// 
// Constraints: 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] consists of only lower-case English letters. 
// 
// Related Topics String 
// 👍 5225 👎 2448

import java.util.logging.Logger;

public class _14_LongestCommonPrefix {
  private static final Logger logger = Logger.getLogger(_14_LongestCommonPrefix.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _14_LongestCommonPrefix().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public String longestCommonPrefix(String[] strs) {
      if (strs == null || strs.length == 0) return "";
      String pre = strs[0];
      for (int i = 1; i < strs.length; i++)
        while (strs[i].indexOf(pre) != 0) {
          pre = pre.substring(0, pre.length() - 1);
          if (pre.isEmpty()) return "";
        }
      return pre;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
