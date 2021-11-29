//Given n pairs of parentheses, write a function to generate all combinations of
// well-formed parentheses. 
//
// 
// Example 1: 
// Input: n = 3
//Output: ["((()))","(()())","(())()","()(())","()()()"]
// Example 2: 
// Input: n = 1
//Output: ["()"]
// 
// 
// Constraints: 
//
// 
// 1 <= n <= 8 
// 
// Related Topics String Dynamic Programming Backtracking 
// 👍 10585 👎 417

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class _22_GenerateParentheses {
  private static final Logger logger = Logger.getLogger(_22_GenerateParentheses.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _22_GenerateParentheses().new Solution();
    solution.generateParenthesis(3);
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public List<String> generateParenthesis(int n) {
      List<String> list = new ArrayList<String>();
      backtrack(list, "", 0, 0, n);
      return list;
    }

    public void backtrack(List<String> list, String str, int open, int close, int max) {

      if (str.length() == max * 2) {
        list.add(str);
        return;
      }

      if (open < max) {
        System.out.printf(str+"/n");
        backtrack(list, str + "(", open + 1, close, max);
        //System.out.printf(str+"/n");
      }

      if (close < open) {
        System.out.printf(str + "/n");
        backtrack(list, str + ")", open, close + 1, max);
        //System.out.printf(str+"/n");
      }
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
