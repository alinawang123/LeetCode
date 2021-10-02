//Given two sorted arrays nums1 and nums2 of size m and n respectively, return t
//he median of the two sorted arrays.
//
// The overall run time complexity should be O(log (m+n)).
//
//
// Example 1:
//
//
//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.
//
//
// Example 2:
//
//
//Input: nums1 = [1,2], nums2 = [3,4]
//Output: 2.50000
//Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
//
//
// Example 3:
//
//
//Input: nums1 = [0,0], nums2 = [0,0]
//Output: 0.00000
//
//
// Example 4:
//
//
//Input: nums1 = [], nums2 = [1]
//Output: 1.00000
//
//
// Example 5:
//
//
//Input: nums1 = [2], nums2 = []
//Output: 2.00000
//
//
//
// Constraints:
//
//
// nums1.length == m
// nums2.length == n
// 0 <= m <= 1000
// 0 <= n <= 1000
// 1 <= m + n <= 2000
// -106 <= nums1[i], nums2[i] <= 106
//
// Related Topics Array Binary Search Divide and Conquer
// 👍 12629 👎 1712

import java.util.logging.Logger;

public class _4_MedianOfTwoSortedArrays {
  private static final Logger logger = Logger.getLogger(_4_MedianOfTwoSortedArrays.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _4_MedianOfTwoSortedArrays().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int m = nums1.length;
      int n = nums2.length;
      if (m > n) return findMedianSortedArrays(nums2, nums1);
      if(m==0) return n%2 ==1? nums2[n/2]:(nums2[n/2]+nums2[n/2-1])*0.5;
      int k = (m + n + 1) / 2;
      int nums1Start = 0;
      int nums1End = m;
      while (nums1Start < nums1End) {
        int nums1Cut = nums1Start + (nums1End - nums1Start) / 2;
        int nums2Cut = k - nums1Cut;
        if (nums1[nums1Cut] < nums2[nums2Cut - 1]) {
          nums1Start = nums1Cut + 1;
        } else {
          nums1End = nums1Cut;
        }
      }
      int nums1Cut = nums1Start;
      int nums2Cut = k - nums1Start;
      int a = Math.max(nums1Cut <= 0 ? Integer.MIN_VALUE : nums1[nums1Cut - 1],
          nums2Cut <= 0 ? Integer.MIN_VALUE : nums2[nums2Cut - 1]);
      int b = Math.min(nums1Cut >= m ? Integer.MAX_VALUE : nums1[nums1Cut],
          nums2Cut >= n ? Integer.MAX_VALUE : nums2[nums2Cut]);
      if ((n + m) % 2 == 1) {
        return a;
      } else {
        return (a + b) * 0.5;
      }
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
