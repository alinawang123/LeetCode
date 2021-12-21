//You are given a string s and an integer k. You can choose any character of the
// string and change it to any other uppercase English character. You can perform 
//this operation at most k times. 
//
// Return the length of the longest substring containing the same letter you can
// get after performing the above operations. 
//
// 
// Example 1: 
//
// 
//Input: s = "ABAB", k = 2
//Output: 4
//Explanation: Replace the two 'A's with two 'B's or vice versa.
// 
//
// Example 2: 
//
// 
//Input: s = "AABABBA", k = 1
//Output: 4
//Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
//The substring "BBBB" has the longest repeating letters, which is 4.
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 105 
// s consists of only uppercase English letters. 
// 0 <= k <= s.length 
// 
// Related Topics Hash Table String Sliding Window 
// 👍 3470 👎 136

import java.util.logging.Logger;

public class _424_LongestRepeatingCharacterReplacement {
  private static final Logger logger = Logger.getLogger(_424_LongestRepeatingCharacterReplacement.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _424_LongestRepeatingCharacterReplacement().new Solution();
    String s = "AABAB";
    int k = 2;
    System.out.println(solution.characterReplacement(s,k));
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int characterReplacement(String s, int k) { //sliding window
      int maxFrequency = 0;
      int maxLength = 0;
      int start = 0;
      int end;
      int count[] = new int[26];
      for (end = 0; end < s.length(); end++) {
        maxFrequency = Math.max(maxFrequency, ++count[s.charAt(end) - 'A']);
        while (end - start - maxFrequency + 1 - k > 0) {
          count[s.charAt(start) -'A']--;
          start++;
        }
        maxLength = Math.max(maxLength, end - start + 1);
      }
      return maxLength;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
