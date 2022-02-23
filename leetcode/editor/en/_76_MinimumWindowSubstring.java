//Given two strings s and t of lengths m and n respectively, return the minimum 
//window substring of s such that every character in t (including duplicates) is i
//ncluded in the window. If there is no such substring, return the empty string ""
//. 
//
// The testcases will be generated such that the answer is unique. 
//
// A substring is a contiguous sequence of characters within the string. 
//
// 
// Example 1: 
//
// 
//Input: s = "ADOBECODEBANC", t = "ABC"
//Output: "BANC"
//Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' fr
//om string t.
// 
//
// Example 2: 
//
// 
//Input: s = "a", t = "a"
//Output: "a"
//Explanation: The entire string s is the minimum window.
// 
//
// Example 3: 
//
// 
//Input: s = "a", t = "aa"
//Output: ""
//Explanation: Both 'a's from t must be included in the window.
//Since the largest window of s only has one 'a', return empty string.
// 
//
// 
// Constraints: 
//
// 
// m == s.length 
// n == t.length 
// 1 <= m, n <= 105 
// s and t consist of uppercase and lowercase English letters. 
// 
//
// 
//Follow up: Could you find an algorithm that runs in O(m + n) time? Related Top
//ics Hash Table String Sliding Window 
// 👍 8639 👎 502

import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Logger;

public class _76_MinimumWindowSubstring {
  private static final Logger logger = Logger.getLogger(_76_MinimumWindowSubstring.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _76_MinimumWindowSubstring().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public String minWindow(String s, String t) {
      if (s == null || s.length() < t.length() || s.length() == 0) {
        return "";
      }
      int[] map = new int[128];
      int start = 0;
      int end;
      int minLength = s.length() + 1;
      int length = 0;

      for (char c : t.toCharArray()) {
        map[c - 'A']++;
      }

      for (end = 0; end < s.length(); end++) {
        if (map[s.charAt(end) - 'A'] > 0) {
          map[s.charAt(end) - 'A']--;
          length++;
        }
        while(length==t.length()){
          if(end -start+1<minLength){
            minLength = end - start +1;
          }



        }


      }


    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
