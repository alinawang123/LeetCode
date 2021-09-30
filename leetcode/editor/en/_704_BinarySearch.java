//Given an array of integers nums which is sorted in ascending order, and an int
//eger target, write a function to search target in nums. If target exists, then r
//eturn its index. Otherwise, return -1.
//
// You must write an algorithm with O(log n) runtime complexity.
//
//
// Example 1:
//
//
//Input: nums = [-1,0,3,5,9,12], target = 9
//Output: 4
//Explanation: 9 exists in nums and its index is 4
//
//
// Example 2:
//
//
//Input: nums = [-1,0,3,5,9,12], target = 2
//Output: -1
//Explanation: 2 does not exist in nums so return -1
//
//
//
// Constraints:
//
//
// 1 <= nums.length <= 104
// -104 < nums[i], target < 104
// All the integers in nums are unique.
// nums is sorted in ascending order.
//
// Related Topics Array Binary Search
// 👍 2150 👎 75

import java.util.logging.Logger;

public class _704_BinarySearch {
  private static final Logger logger = Logger.getLogger(_704_BinarySearch.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _704_BinarySearch().new Solution();
    logger.info("Solution:" + solution.search(new int[]{-1,0,3,5,9,12}, 2));
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int search(int[] nums, int target) {
      int low = 0;
      int high = nums.length - 1;
      while (low<=high) {
        int mid = low + ((high - low) / 2);
        if(nums[mid]> target){
          high= mid-1;
        } else if (nums[mid]<target){
          low = mid+1;
        } else {
          return mid;
        }
      }
      return -1;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
