//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']
//', determine if the input string is valid. 
//
// An input string is valid if: 
//
// 
// Open brackets must be closed by the same type of brackets. 
// Open brackets must be closed in the correct order. 
// 
//
// 
// Example 1: 
//
// 
//Input: s = "()"
//Output: true
// 
//
// Example 2: 
//
// 
//Input: s = "()[]{}"
//Output: true
// 
//
// Example 3: 
//
// 
//Input: s = "(]"
//Output: false
// 
//
// Example 4: 
//
// 
//Input: s = "([)]"
//Output: false
// 
//
// Example 5: 
//
// 
//Input: s = "{[]}"
//Output: true
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 104 
// s consists of parentheses only '()[]{}'. 
// 
// Related Topics String Stack 
// 👍 8731 👎 346

import java.util.Stack;
import java.util.logging.Logger;

public class _20_ValidParentheses {
  private static final Logger logger = Logger.getLogger(_20_ValidParentheses.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _20_ValidParentheses().new Solution();
    logger.info("Solution:" + solution.isValid("()[]{}"));
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public boolean isValid(String s) {
      Stack<Character> stack = new Stack<>();
      for (int i = 0; i < s.length(); i++) {
        if(s.charAt(i) == '(') {
          stack.push(')');
        } else if (s.charAt(i) == '{') {
          stack.push('}');
        } else if (s.charAt(i) == '[') {
          stack.push(']');
        } else if ( stack.isEmpty() || s.charAt(i) != stack.pop() ){
          return false;
        }
      }
      return stack.isEmpty();
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
