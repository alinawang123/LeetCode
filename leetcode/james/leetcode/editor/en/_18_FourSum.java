package james.leetcode.editor.en;

//Given an array nums of n integers, return an array of all the unique quadruple
//ts [nums[a], nums[b], nums[c], nums[d]] such that: 
//
// 
// 0 <= a, b, c, d < n 
// a, b, c, and d are distinct. 
// nums[a] + nums[b] + nums[c] + nums[d] == target 
// 
//
// You may return the answer in any order. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,0,-1,0,-2,2], target = 0
//Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
// 
//
// Example 2: 
//
// 
//Input: nums = [2,2,2,2,2], target = 8
//Output: [[2,2,2,2]]
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 200 
// -109 <= nums[i] <= 109 
// -109 <= target <= 109 
// 
// Related Topics Array Hash Table Two Pointers 
// 👍 3220 👎 407


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class _18_FourSum{

    private static final Logger logger = LoggerFactory.getLogger(_18_FourSum .class);
    
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        Solution solution = new _18_FourSum().new Solution();
        
//        assertEquals();
        
        logger.info("time cost: [{}] ms", System.currentTimeMillis() - startTimeMillis);
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> output = new ArrayList<>();
        if (nums == null || nums.length < 4) return output;

        Arrays.sort(nums);

        return output;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}