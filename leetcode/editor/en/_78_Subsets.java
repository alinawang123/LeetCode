//Given an integer array nums of unique elements, return all possible subsets (t
//he power set). 
//
// The solution set must not contain duplicate subsets. Return the solution in a
//ny order. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,2,3]
//Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
// 
//
// Example 2: 
//
// 
//Input: nums = [0]
//Output: [[],[0]]
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10 
// -10 <= nums[i] <= 10 
// All the numbers of nums are unique. 
// 
// Related Topics Array Backtracking Bit Manipulation 
// 👍 7608 👎 127

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class _78_Subsets {
  private static final Logger logger = Logger.getLogger(_78_Subsets.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _78_Subsets().new Solution();
    solution.subsets( new int[]{1,2,3});
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public List<List<Integer>> subsets(int[] nums) {
      Arrays.sort(nums);
      List<List<Integer>> output = new ArrayList<>();
      List<Integer> curList = new ArrayList<>();
      backtrack(output, curList, nums, 0);
      //System.out.printf(output.toString());
      return output;

    }

    private void backtrack(List<List<Integer>> output, List<Integer> curList, int[] nums,
                           int start) {
      output.add(new ArrayList<>(curList));
      for (int i = start; i < nums.length; i++) {
        curList.add(nums[i]);
        backtrack(output, curList, nums, i + 1);
        //System.out.printf(curList.toString());
        curList.remove(curList.size()-1);
        System.out.printf(curList.toString());
      }
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
