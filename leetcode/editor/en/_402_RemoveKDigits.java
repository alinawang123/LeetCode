//Given string num representing a non-negative integer num, and an integer k, re
//turn the smallest possible integer after removing k digits from num. 
//
// 
// Example 1: 
//
// 
//Input: num = "1432219", k = 3
//Output: "1219"
//Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 w
//hich is the smallest.
// 
//
// Example 2: 
//
// 
//Input: num = "10200", k = 1
//Output: "200"
//Explanation: Remove the leading 1 and the number is 200. Note that the output 
//must not contain leading zeroes.
// 
//
// Example 3: 
//
// 
//Input: num = "10", k = 2
//Output: "0"
//Explanation: Remove all the digits from the number and it is left with nothing
// which is 0.
// 
//
// 
// Constraints: 
//
// 
// 1 <= k <= num.length <= 105 
// num consists of only digits. 
// num does not have any leading zeros except for the zero itself. 
// 
// Related Topics String Stack Greedy Monotonic Stack 
// 👍 4149 👎 172

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Logger;

public class _402_RemoveKDigits {
  private static final Logger logger = Logger.getLogger(_402_RemoveKDigits.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _402_RemoveKDigits().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public String removeKdigits(String num, int k) {
      Deque<Character> stack = new ArrayDeque<>();   // monotonous increasing stack
      for (int i = 0; i < num.length(); i++) {
        while (k > 0 && !stack.isEmpty() && stack.peekFirst() > num.charAt(i)) {
          stack.pollFirst();
          k--;
        }
        stack.offerFirst(num.charAt(i));
      }
      while (k > 0 && !stack.isEmpty()) {
        stack.pollFirst();
        k--;
      }
      while (!stack.isEmpty() && stack.peekLast() == '0') {
        stack.pollLast();
      }
      String ans = "";
      while (!stack.isEmpty()) {
        ans += stack.pollLast();
      }
      return ans.equals("") ? "0" : ans;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
