//Given an array nums of distinct integers, return all the possible permutations
//. You can return the answer in any order. 
//
// 
// Example 1: 
// Input: nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// Example 2: 
// Input: nums = [0,1]
//Output: [[0,1],[1,0]]
// Example 3: 
// Input: nums = [1]
//Output: [[1]]
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 6 
// -10 <= nums[i] <= 10 
// All the integers of nums are unique. 
// 
// Related Topics Array Backtracking 
// 👍 8152 👎 159

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class _46_Permutations {
  private static final Logger logger = Logger.getLogger(_46_Permutations.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _46_Permutations().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public List<List<Integer>> permute(int[] nums) {
      Arrays.sort(nums);//can not sum
      List<List<Integer>> output = new ArrayList<>();
      List<Integer> curList = new ArrayList<>();
      backtrack(output, curList, nums);
      return output;

    }

    private void backtrack(List<List<Integer>> output, List<Integer> curList, int[] nums
                           ) {
      if (curList.size() == nums.length) {
        output.add(new ArrayList<>(curList));
      } else{
        for (int i = 0; i < nums.length; i++) {
          if(curList.contains(nums[i])) continue;
          curList.add(nums[i]);
          backtrack(output, curList, nums);
          curList.remove(curList.size() - 1);
        }
      }
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
