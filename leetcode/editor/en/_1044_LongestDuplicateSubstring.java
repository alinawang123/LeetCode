//Given a string s, consider all duplicated substrings: (contiguous) substrings 
//of s that occur 2 or more times. The occurrences may overlap. 
//
// Return any duplicated substring that has the longest possible length. If s do
//es not have a duplicated substring, the answer is "". 
//
// 
// Example 1: 
// Input: s = "banana"
//Output: "ana"
// Example 2: 
// Input: s = "abcd"
//Output: ""
// 
// 
// Constraints: 
//
// 
// 2 <= s.length <= 3 * 104 
// s consists of lowercase English letters. 
// 
// Related Topics String Binary Search Sliding Window Rolling Hash Suffix Array 
//Hash Function 
// 👍 1052 👎 269

import java.util.logging.Logger;
public class _1044_LongestDuplicateSubstring{
    private static final Logger logger = Logger.getLogger(_1044_LongestDuplicateSubstring .class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        Solution solution = new _1044_LongestDuplicateSubstring().new Solution();
        // assert solution == ;
        logger.warning(String.valueOf(solution));
        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestDupSubstring(String s) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
