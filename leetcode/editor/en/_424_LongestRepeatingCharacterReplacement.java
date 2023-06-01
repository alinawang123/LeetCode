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
      int right;
      int left = 0;
      int res = 0;
      int maxFrequency = 0;
      int[] count = new int[26];
      for (right = 0; right < s.length(); right++) {
        maxFrequency = Math.max(maxFrequency, ++count[s.charAt(right) - 'A']);
        while (right - left + 1 - maxFrequency > k) { //while loop
          count[s.charAt(left) -'A']--;
          left++;
        }
        res = Math.max(res, right-left +1);
      }
      return res;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
