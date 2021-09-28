//Given an array of integers heights representing the histogram's bar height whe
//re the width of each bar is 1, return the area of the largest rectangle in the h
//istogram. 
//
// 
// Example 1: 
//
// 
//Input: heights = [2,1,5,6,2,3]
//Output: 10
//Explanation: The above is a histogram where width of each bar is 1.
//The largest rectangle is shown in the red area, which has an area = 10 units.
// 
//
// Example 2: 
//
// 
//Input: heights = [2,4]
//Output: 4
// 
//
// 
// Constraints: 
//
// 
// 1 <= heights.length <= 105 
// 0 <= heights[i] <= 104 
// 
// Related Topics Array Stack Monotonic Stack 
// 👍 7235 👎 118

import java.util.logging.Logger;
public class _84_LargestRectangleInHistogram{
    private static final Logger logger = Logger.getLogger(_84_LargestRectangleInHistogram .class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        Solution solution = new _84_LargestRectangleInHistogram().new Solution();
        // assert solution == ;
        logger.warning(String.valueOf(solution));
        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int largestRectangleArea(int[] heights) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
