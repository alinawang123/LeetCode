//Given a string containing just the characters '(' and ')', find the length of 
//the longest valid (well-formed) parentheses substring. 
//
// 
// Example 1: 
//
// 
//Input: s = "(()"
//Output: 2
//Explanation: The longest valid parentheses substring is "()".
// 
//
// Example 2: 
//
// 
//Input: s = ")()())"
//Output: 4
//Explanation: The longest valid parentheses substring is "()()".
// 
//
// Example 3: 
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
// 0 <= s.length <= 3 * 104 
// s[i] is '(', or ')'. 
// 
// Related Topics String Dynamic Programming Stack 
// 👍 6221 👎 214

import java.util.Queue;
import java.util.Stack;
import java.util.logging.Logger;

public class _32_LongestValidParentheses {
  private static final Logger logger = Logger.getLogger(_32_LongestValidParentheses.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _32_LongestValidParentheses().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int longestValidParentheses(String s) {
      Stack<Integer> stack = new Stack<Integer>();
      int result = 0;
      stack.push(-1);
      for(int i=0; i<s.length(); i++) {
        if(s.charAt(i)=='(') {
          stack.push(i);
        } else {
          stack.pop();
          if (stack.isEmpty()) stack.push(i);
          else {
            result = Math.max(result, i-stack.peek());
          }
        }
      }
      return result;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
