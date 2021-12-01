//Given a string s, partition s such that every substring of the partition is a 
//palindrome. Return all possible palindrome partitioning of s. 
//
// A palindrome string is a string that reads the same backward as forward. 
//
// 
// Example 1: 
// Input: s = "aab"
//Output: [["a","a","b"],["aa","b"]]
// Example 2: 
// Input: s = "a"
//Output: [["a"]]
// 
// 
// Constraints: 
//
// 
// 1 <= s.length <= 16 
// s contains only lowercase English letters. 
// 
// Related Topics String Dynamic Programming Backtracking 
// 👍 4841 👎 151

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
public class _131_PalindromePartitioning{
    private static final Logger logger = Logger.getLogger(_131_PalindromePartitioning .class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        Solution solution = new _131_PalindromePartitioning().new Solution();
        // assert solution == ;
        logger.warning(String.valueOf(solution));
        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<>();
        List<String> curList = new ArrayList<>();
        backtrack(list, curList, s, 0);
        return list;
    }

        public void backtrack(List<List<String>> list, List<String> curList, String s, int start){
            if(start == s.length())
                list.add(new ArrayList<>(curList));
            else{
                for(int i = start; i < s.length(); i++){
                    if(isPalindrome(s, start, i)){
                        curList.add(s.substring(start, i + 1));
                        backtrack(list, curList, s, i + 1);
                        curList.remove(curList.size() - 1);
                    }
                }
            }
        }

        public boolean isPalindrome(String s, int low, int high){
            while(low < high)
                if(s.charAt(low++) != s.charAt(high--)) return false;
            return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
