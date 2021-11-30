//Given an integer array nums that may contain duplicates, return all possible s
//ubsets (the power set). 
//
// The solution set must not contain duplicate subsets. Return the solution in a
//ny order. 
//
// 
// Example 1: 
// Input: nums = [1,2,2]
//Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
// Example 2: 
// Input: nums = [0]
//Output: [[],[0]]
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10 
// -10 <= nums[i] <= 10 
// 
// Related Topics Array Backtracking Bit Manipulation 
// 👍 3823 👎 129

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
public class _90_SubsetsIi{
    private static final Logger logger = Logger.getLogger(_90_SubsetsIi .class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        Solution solution = new _90_SubsetsIi().new Solution();
        solution.subsetsWithDup( new int[]{1,2,2});
        logger.warning(String.valueOf(solution));
        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
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
                if(i > start && nums[i] == nums[i-1]) continue; //important to understand
                curList.add(nums[i]);
                backtrack(output, curList, nums, i + 1);
                System.out.println(curList.toString());
                curList.remove(curList.size() - 1);
            }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
