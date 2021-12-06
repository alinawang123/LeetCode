//Given an array of distinct integers nums and a target integer target, return t
//he number of possible combinations that add up to target. 
//
// The answer is guaranteed to fit in a 32-bit integer. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,2,3], target = 4
//Output: 7
//Explanation:
//The possible combination ways are:
//(1, 1, 1, 1)
//(1, 1, 2)
//(1, 2, 1)
//(1, 3)
//(2, 1, 1)
//(2, 2)
//(3, 1)
//Note that different sequences are counted as different combinations.
// 
//
// Example 2: 
//
// 
//Input: nums = [9], target = 3
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 200 
// 1 <= nums[i] <= 1000 
// All the elements of nums are unique. 
// 1 <= target <= 1000 
// 
//
// 
// Follow up: What if negative numbers are allowed in the given array? How does 
//it change the problem? What limitation we need to add to the question to allow n
//egative numbers? 
// Related Topics Array Dynamic Programming 
// 👍 2883 👎 328

import java.util.logging.Logger;
public class _377_CombinationSumIv{
    private static final Logger logger = Logger.getLogger(_377_CombinationSumIv .class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        Solution solution = new _377_CombinationSumIv().new Solution();
        int[] nums = new int[]{1,2,3};
        int target = 4;
        solution.combinationSum4(nums, target);
        logger.warning(String.valueOf(solution));
        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(nums[j] <= i) {
                    dp[i] += dp[i - nums[j]];
                }
            }
        }
        //System.out.println(dp[target]);
        return dp[target];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
