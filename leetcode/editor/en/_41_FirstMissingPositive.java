//Given an unsorted integer array nums, return the smallest missing positive int
//eger.
//
// You must implement an algorithm that runs in O(n) time and uses constant extr
//a space.
//
//
// Example 1:
// Input: nums = [1,2,0]
//Output: 3
// Example 2:
// Input: nums = [3,4,-1,1]
//Output: 2
// Example 3:
// Input: nums = [7,8,9,11,12]
//Output: 1
//
//
// Constraints:
//
//
// 1 <= nums.length <= 5 * 105
// -231 <= nums[i] <= 231 - 1
//
// Related Topics Array Hash Table
// 👍 7192 👎 1131

import java.util.logging.Logger;
public class _41_FirstMissingPositive{
    private static final Logger logger = Logger.getLogger(_41_FirstMissingPositive .class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        Solution solution = new _41_FirstMissingPositive().new Solution();
        // assert solution == ;
        logger.warning(String.valueOf(solution));
        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int firstMissingPositive(int[] nums) {
      

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
