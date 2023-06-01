//Given a string s, find the length of the longest substring without repeating c
//haracters. 
//
// 
// Example 1: 
//
// 
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
// 
//
// Example 2: 
//
// 
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
// 
//
// Example 3: 
//
// 
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a 
//substring.
// 
//
// Example 4: 
//
// 
//Input: s = ""
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// 0 <= s.length <= 5 * 104 
// s consists of English letters, digits, symbols and spaces. 
// 
// Related Topics Hash Table String Sliding Window 
// 👍 19533 👎 891

import java.util.HashMap;
import java.util.HashSet;
import java.util.logging.Logger;
public class _3_LongestSubstringWithoutRepeatingCharacters{
    private static final Logger logger = Logger.getLogger(_3_LongestSubstringWithoutRepeatingCharacters .class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        Solution solution = new _3_LongestSubstringWithoutRepeatingCharacters().new Solution();
        String s = "pwwkew";
        System.out.println(solution.lengthOfLongestSubstring(s));
        logger.warning(String.valueOf(solution));
        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int left = 0;
        int right = 0;
        HashSet<Character> set = new HashSet<>();
        while( right < s.length()) {
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                res = Math.max(res, set.size());
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
