//Given an array nums with n objects colored red, white, or blue, sort them in-p
//lace so that objects of the same color are adjacent, with the colors in the orde
//r red, white, and blue. 
//
// We will use the integers 0, 1, and 2 to represent the color red, white, and b
//lue, respectively. 
//
// You must solve this problem without using the library's sort function. 
//
// 
// Example 1: 
// Input: nums = [2,0,2,1,1,0]
//Output: [0,0,1,1,2,2]
// Example 2: 
// Input: nums = [2,0,1]
//Output: [0,1,2]
// Example 3: 
// Input: nums = [0]
//Output: [0]
// Example 4: 
// Input: nums = [1]
//Output: [1]
// 
// 
// Constraints: 
//
// 
// n == nums.length 
// 1 <= n <= 300 
// nums[i] is 0, 1, or 2. 
// 
//
// 
// Follow up: Could you come up with a one-pass algorithm using only constant ex
//tra space? 
// Related Topics Array Two Pointers Sorting 
// 👍 6952 👎 344

import java.util.Arrays;
import java.util.logging.Logger;

public class _75_SortColors {
  private static final Logger logger = Logger.getLogger(_75_SortColors.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _75_SortColors().new Solution();
    solution.sortColors(new int[]{1, 2, 0});
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public void sortColors(int[] nums) {
      int n = nums.length;
      int j = 0, k = n - 1;
      for (int i = 0; i <= k; ++i){
        if (nums[i] == 0 && i != j)
          swap(nums, i--, j++);
        else if (nums[i] == 2 && i != k)
          swap(nums,i--, k--);
      }
      System.out.printf(Arrays.toString(nums));
    }

    private void swap(int[] nums, int i, int j) {
      int temp = nums[i];
      nums[i] = nums[j];
      nums[j] = temp;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
