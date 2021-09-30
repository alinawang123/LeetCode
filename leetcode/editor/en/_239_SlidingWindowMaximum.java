//You are given an array of integers nums, there is a sliding window of size k w
//hich is moving from the very left of the array to the very right. You can only s
//ee the k numbers in the window. Each time the sliding window moves right by one
//position.
//
// Return the max sliding window.
//
//
// Example 1:
//
//
//Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
//Output: [3,3,5,5,6,7]
//Explanation:
//Window position                Max
//---------------               -----
//[1  3  -1] -3  5  3  6  7       3
// 1 [3  -1  -3] 5  3  6  7       3
// 1  3 [-1  -3  5] 3  6  7       5
// 1  3  -1 [-3  5  3] 6  7       5
// 1  3  -1  -3 [5  3  6] 7       6
// 1  3  -1  -3  5 [3  6  7]      7
//
//
// Example 2:
//
//
//Input: nums = [1], k = 1
//Output: [1]
//
//
// Example 3:
//
//
//Input: nums = [1,-1], k = 1
//Output: [1,-1]
//
//
// Example 4:
//
//
//Input: nums = [9,11], k = 2
//Output: [11]
//
//
// Example 5:
//
//
//Input: nums = [4,-2], k = 2
//Output: [4]
//
//
//
// Constraints:
//
//
// 1 <= nums.length <= 105
// -104 <= nums[i] <= 104
// 1 <= k <= nums.length
//
// Related Topics Array Queue Sliding Window Heap (Priority Queue) Monotonic Que
//ue
// 👍 7387 👎 268

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.logging.Logger;

public class _239_SlidingWindowMaximum {
  private static final Logger logger = Logger.getLogger(_239_SlidingWindowMaximum.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _239_SlidingWindowMaximum().new Solution();
    int[] nums = {1,3,1,2,0,5};
    int k = 3;
    solution.maxSlidingWindow(nums, k);
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
      if (nums == null || k <= 0) return new int[0];
      int[] output = new int[nums.length - k + 1];
      int index = 0;
      Deque<Integer> queue = new ArrayDeque<>();
      for (int i = 0; i < nums.length; i++) {
        while (!queue.isEmpty() && queue.peek() < i - k + 1) {
          queue.poll(); //remove numbers out of range k
        }
        while (!queue.isEmpty() && nums[queue.peekLast()] < nums[i]) {
          queue.pollLast();
        }
        queue.offer(i);
        if (i >= k - 1) {
          output[index++] = nums[queue.peek()];
        }
      }

      return output;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
