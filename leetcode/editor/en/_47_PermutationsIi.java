//Given a collection of numbers, nums, that might contain duplicates, return all
// possible unique permutations in any order. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,1,2]
//Output:
//[[1,1,2],
// [1,2,1],
// [2,1,1]]
// 
//
// Example 2: 
//
// 
//Input: nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 8 
// -10 <= nums[i] <= 10 
// 
// Related Topics Array Backtracking 
// 👍 4010 👎 87

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
public class _47_PermutationsIi{
    private static final Logger logger = Logger.getLogger(_47_PermutationsIi .class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        Solution solution = new _47_PermutationsIi().new Solution();
        // assert solution == ;
        logger.warning(String.valueOf(solution));
        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);//can not sum
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> curList = new ArrayList<>();
        backtrack(output, curList, nums,new boolean[nums.length]);
        return output;

    }

        private void backtrack(List<List<Integer>> output, List<Integer> curList, int[] nums
        , boolean [] used) {
            if (curList.size() == nums.length) {
                output.add(new ArrayList<>(curList));
            } else {
                for (int i = 0; i < nums.length; i++) {
                    if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue;
                    used[i]= true;
                    curList.add(nums[i]);
                    backtrack(output, curList, nums, used);
                    used[i] = false;
                    curList.remove(curList.size() - 1);
                }
            }
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)


