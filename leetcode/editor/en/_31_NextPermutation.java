//Implement next permutation, which rearranges numbers into the lexicographicall
//y next greater permutation of numbers. 
//
// If such an arrangement is not possible, it must rearrange it as the lowest po
//ssible order (i.e., sorted in ascending order). 
//
// The replacement must be in place and use only constant extra memory. 
//
// 
// Example 1: 
// Input: nums = [1,2,3]
//Output: [1,3,2]
// Example 2: 
// Input: nums = [3,2,1]
//Output: [1,2,3]
// Example 3: 
// Input: nums = [1,1,5]
//Output: [1,5,1]
// Example 4: 
// Input: nums = [1]
//Output: [1]
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 100 
// 0 <= nums[i] <= 100 
// 
// Related Topics Array Two Pointers 
// 👍 7225 👎 2364

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.logging.Logger;

public class _31_NextPermutation {
  private static final Logger logger = Logger.getLogger(_31_NextPermutation.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _31_NextPermutation().new Solution();
    int[] nums = {5,1,1};
    solution.nextPermutation(nums);
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public void nextPermutation(int[] nums) {
      if (nums.length <= 1) return;
      int len = nums.length;
      int lastInc = - 1;
      for (int i = 1; i < len; i++) {
        if (nums[i] > nums[i - 1]) {
          lastInc = i;
        }
      }
      if (lastInc == - 1) { //nums in dec order
        Arrays.sort(nums);
        System.out.printf(Arrays.toString(nums));
        return;
      }

      int index = lastInc;
      for (int i = lastInc; i < len; i++) {
        if (nums[i] > nums[lastInc - 1] && nums[i] < nums[index]) {
          index = i;
        }
      }
      swap(nums, lastInc - 1, index);
      Arrays.sort(nums, lastInc, len);
      System.out.printf(Arrays.toString(nums));
    }

    public void swap(int[] A, int i, int j) {
      int tmp = A[i];
      A[i] = A[j];
      A[j] = tmp;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
