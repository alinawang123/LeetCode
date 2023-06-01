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
import java.util.HashSet;
import java.util.Locale;
import java.util.logging.Logger;

public class _76_MinimumWindowSubstring {
  private static final Logger logger = Logger.getLogger(_76_MinimumWindowSubstring.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _76_MinimumWindowSubstring().new Solution();
    String s = "ADOBECODEBANC";
    String t = "ABC";
    System.out.println(solution.minWindow(s,t));
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public String minWindow(String s, String t) {
      HashMap<Character, Integer> map = new HashMap<>();
      for(char c : t.toCharArray()){
        if(map.containsKey(c)) {
          map.put(c, map.get(c)+1);
        } else {
          map.put(c, 1);
        }
      }
      int start = 0;
      int end = 0;
      String res = "";
      int count =0;
      for(end = 0; end < s.length(); end ++) {
        if(map.containsKey(s.charAt(end))) {
          map.put(s.charAt(end), map.get(s.charAt(end))-1);
          if(map.containsKey(s.charAt(end)) && map.get(s.charAt(end)) >= 0) {
            count ++;
          }
          while(count == t.length()) {
            if(res.equals("") || end - start +1 < res.length()) {
              res = s.substring(start, end+1);
            }
            if(map.containsKey(s.charAt(start))) {
              map.put(s.charAt(start), map.get(s.charAt(start))+1);
              if(map.get(s.charAt(start))>0) {
                count --;
              }
            }
            start ++;
          }
        }
      }

      return res;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
