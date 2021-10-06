//Given an integer array nums and an integer k, return the kth largest element i
//n the array.
//
// Note that it is the kth largest element in the sorted order, not the kth dist
//inct element.
//
//
// Example 1:
// Input: nums = [3,2,1,5,6,4], k = 2
//Output: 5
// Example 2:
// Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
//Output: 4
//
//
// Constraints:
//
//
// 1 <= k <= nums.length <= 104
// -104 <= nums[i] <= 104
//
// Related Topics Array Divide and Conquer Sorting Heap (Priority Queue) Quickse
//lect
// 👍 6966 👎 406

import java.util.PriorityQueue;
import java.util.logging.Logger;
public class _215_KthLargestElementInAnArray{
    private static final Logger logger = Logger.getLogger(_215_KthLargestElementInAnArray .class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        Solution solution = new _215_KthLargestElementInAnArray().new Solution();
        solution.findKthLargest(new int[]{1, 2, 0}, 2);
        logger.warning(String.valueOf(solution));
        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findKthLargest(int[] nums, int k) {
      final PriorityQueue<Integer> pq = new PriorityQueue<>();
      for(int val : nums) {
        pq.offer(val);

        if(pq.size() > k) {
          pq.poll();
        }
      }
      return pq.peek();

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
