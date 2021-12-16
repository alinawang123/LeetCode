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
import java.util.logging.Logger;
public class _3_LongestSubstringWithoutRepeatingCharacters{
    private static final Logger logger = Logger.getLogger(_3_LongestSubstringWithoutRepeatingCharacters .class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        Solution solution = new _3_LongestSubstringWithoutRepeatingCharacters().new Solution();
        String s = "abcabcbb";
        System.out.println(solution.lengthOfLongestSubstring(s));
        logger.warning(String.valueOf(solution));
        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        int res=0;

        for (int left = 0, right =0; left < s.length(); left++) {
            if(map.containsKey(s.charAt(left))){
                right = Math.max(map.get(s.charAt(left)) +1, right);
            }
            map.put(s.charAt(left), left);
            res= Math.max(res, left- right +1);
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
