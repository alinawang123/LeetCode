//Given two strings s and t, return true if t is an anagram of s, and false othe
//rwise. 
//
// An Anagram is a word or phrase formed by rearranging the letters of a differe
//nt word or phrase, typically using all the original letters exactly once. 
//
// 
// Example 1: 
// Input: s = "anagram", t = "nagaram"
//Output: true
// Example 2: 
// Input: s = "rat", t = "car"
//Output: false
// 
// 
// Constraints: 
//
// 
// 1 <= s.length, t.length <= 5 * 104 
// s and t consist of lowercase English letters. 
// 
//
// 
// Follow up: What if the inputs contain Unicode characters? How would you adapt
// your solution to such a case? 
// Related Topics Hash Table String Sorting 
// 👍 4261 👎 201

import java.util.HashMap;
import java.util.logging.Logger;

public class _242_ValidAnagram {
  private static final Logger logger = Logger.getLogger(_242_ValidAnagram.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _242_ValidAnagram().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public boolean isAnagram(String s, String t) {
      int[] charactorMap = new int[26];
      for (int i = 0; i < s.length(); i++) {
        charactorMap[s.charAt(i) - 'a']++;
      }
      for (int i = 0; i < t.length(); i++) {
        charactorMap[t.charAt(i) - 'a']--;
      }
      for (int i : charactorMap) {
        if (i != 0) {
          return false;
        }
      }
      return true;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
