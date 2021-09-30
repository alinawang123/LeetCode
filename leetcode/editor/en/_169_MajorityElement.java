//Given an array nums of size n, return the majority element.
//
// The majority element is the element that appears more than ⌊n / 2⌋ times. You
// may assume that the majority element always exists in the array.
//
//
// Example 1:
// Input: nums = [3,2,3]
//Output: 3
// Example 2:
// Input: nums = [2,2,1,1,1,2,2]
//Output: 2
//
//
// Constraints:
//
//
// n == nums.length
// 1 <= n <= 5 * 104
// -231 <= nums[i] <= 231 - 1
//
//
//
//Follow-up: Could you solve the problem in linear time and in O(1) space? Relat
//ed Topics Array Hash Table Divide and Conquer Sorting Counting
// 👍 6566 👎 291

import java.util.logging.Logger;
public class _169_MajorityElement{
    private static final Logger logger = Logger.getLogger(_169_MajorityElement .class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        Solution solution = new _169_MajorityElement().new Solution();
        // assert solution == ;
        logger.warning(String.valueOf(solution));
        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int majorityElement(int[] nums) {

      

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
