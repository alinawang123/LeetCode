//Given an integer array nums, you need to find one continuous subarray that if 
//you only sort this subarray in ascending order, then the whole array will be sor
//ted in ascending order. 
//
// Return the shortest such subarray and output its length. 
//
// 
// Example 1: 
//
// 
//Input: nums = [2,6,4,8,10,9,15]
//Output: 5
//Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the 
//whole array sorted in ascending order.
// 
//
// Example 2: 
//
// 
//Input: nums = [1,2,3,4]
//Output: 0
// 
//
// Example 3: 
//
// 
//Input: nums = [1]
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 104 
// -105 <= nums[i] <= 105 
// 
//
// 
//Follow up: Can you solve it in O(n) time complexity? Related Topics Array Two 
//Pointers Stack Greedy Sorting Monotonic Stack 
// 👍 4387 👎 193

import java.util.logging.Logger;
public class _581_ShortestUnsortedContinuousSubarray{
    private static final Logger logger = Logger.getLogger(_581_ShortestUnsortedContinuousSubarray .class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        Solution solution = new _581_ShortestUnsortedContinuousSubarray().new Solution();
        // assert solution == ;
        logger.warning(String.valueOf(solution));
        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
