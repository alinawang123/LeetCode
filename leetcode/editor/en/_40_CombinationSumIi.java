//Given a collection of candidate numbers (candidates) and a target number (targ
//et), find all unique combinations in candidates where the candidate numbers sum 
//to target. 
//
// Each number in candidates may only be used once in the combination. 
//
// Note: The solution set must not contain duplicate combinations. 
//
// 
// Example 1: 
//
// 
//Input: candidates = [10,1,2,7,6,1,5], target = 8
//Output: 
//[
//[1,1,6],
//[1,2,5],
//[1,7],
//[2,6]
//]
// 
//
// Example 2: 
//
// 
//Input: candidates = [2,5,2,1,2], target = 5
//Output: 
//[
//[1,2,2],
//[5]
//]
// 
//
// 
// Constraints: 
//
// 
// 1 <= candidates.length <= 100 
// 1 <= candidates[i] <= 50 
// 1 <= target <= 30 
// 
// Related Topics Array Backtracking 
// 👍 3946 👎 106

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

public class _40_CombinationSumIi {
  private static final Logger logger = Logger.getLogger(_40_CombinationSumIi.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _40_CombinationSumIi().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
      List<List<Integer>> output = new ArrayList<>();
      List<Integer> curList = new ArrayList<>();
      Arrays.sort(candidates);
      backtrack(output, curList, 0, target, candidates);
      return output;
    }

    public void backtrack(List<List<Integer>> output, List<Integer> currList, int start,
                          int target, int[] candidates) {
      if (target < 0) { return;
      }
      else if (target == 0) {
        output.add(new ArrayList<>(currList));
      } else {
        for (int i = start; i < candidates.length; i++) {
          if(i > start && candidates[i] == candidates[i-1]) continue; //skip duplicates
          currList.add(candidates[i]);
          backtrack(output, currList, i + 1, target - candidates[i], candidates);
          currList.remove(currList.size() - 1);
        }
      }

    }
  }
//leetcode submit region end(Prohibit modification and deletion)


}
