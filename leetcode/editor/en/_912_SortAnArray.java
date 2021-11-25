//Given an array of integers nums, sort the array in ascending order.
//
//
// Example 1:
// Input: nums = [5,2,3,1]
//Output: [1,2,3,5]
// Example 2:
// Input: nums = [5,1,1,2,0,0]
//Output: [0,0,1,1,2,5]
//
//
// Constraints:
//
//
// 1 <= nums.length <= 5 * 104
// -5 * 104 <= nums[i] <= 5 * 104
//
// Related Topics Array Divide and Conquer Sorting Heap (Priority Queue) Merge S
//ort Bucket Sort Radix Sort Counting Sort
// 👍 1338 👎 448

import java.util.logging.Logger;
public class _912_SortAnArray{
    private static final Logger logger = Logger.getLogger(_912_SortAnArray .class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        Solution solution = new _912_SortAnArray().new Solution();
        // assert solution == ;
        logger.warning(String.valueOf(solution));
        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        private static final int QUICKSORTSHOLD = 50;
        private static final int MERGESORTSHOLD = 300;

        public int[] sortArray(int[] nums) {
            if (nums == null || nums.length < 2){
                return nums;
            }

            if (nums.length < QUICKSORTSHOLD){
                selectionSort(nums);
            }else if (nums.length < MERGESORTSHOLD) {
                quickSort(nums);
            }else{
                mergeSort(nums);
            }
            return nums;
        }

        private void selectionSort(int[] nums){
            for (int i = 0; i < nums.length; i++){
                int minIndex = i;
                for (int j = i + 1; j < nums.length; j++){
                    if (nums[j] < nums[minIndex]){
                        minIndex = j;
                    }
                }
                exch(nums, i, minIndex);
            }
        }

        private void quickSort(int[] nums){
            quickSort(nums, 0, nums.length - 1);
        }

        private void quickSort(int[] nums, int lo, int hi){
            if (lo >= hi)
                return ;
            int pivot = partition(nums, lo, hi);
            quickSort(nums, lo, pivot - 1);
            quickSort(nums, pivot + 1, hi);
        }

        private int partition(int[] nums, int lo, int hi){
            int q = lo + (int)(Math.random() * (hi - lo + 1));
            exch(nums, lo, q);

            int index = lo + 1;
            for (int i = lo + 1; i <= hi; i++){
                if (nums[i] < nums[lo]){
                    exch(nums, i, index++);
                }
            }
            exch (nums, lo, --index);
            return index;
        }

        private void mergeSort(int[] nums){
            mergeSort(nums, 0, nums.length - 1);
        }

        private void mergeSort(int[] nums, int lo, int hi){
            if (lo >= hi)
                return ;
            int mid = (lo + hi) >>> 1;
            mergeSort(nums, lo, mid);
            mergeSort(nums, mid + 1, hi);
            merge(nums, lo, mid, mid + 1, hi);
        }

        private void merge(int[] nums, int preLo, int preHi, int endLo, int endHi){
            if (preLo == endHi)
                return;
            int lo = preLo;
            int hi = endHi;

            int[] newArr = new int[preHi - preLo + 1 + endHi - endLo + 1];
            int index = 0;
            while (preLo <= preHi && endLo <= endHi){
                newArr[index++] = (nums[preLo] < nums[endLo]) ? nums[preLo++] : nums[endLo++];
            }
            while (preLo <= preHi){
                newArr[index++] = nums[preLo++];
            }
            while (endLo <= endHi){
                newArr[index++] = nums[endLo++];
            }

            index = 0;
            while (lo <= hi){
                nums[lo++] = newArr[index++];
            }
        }
        private void exch(int[] nums, int i, int j){
            if (i == j)
                return;
            nums[i] ^= nums[j];
            nums[j] ^= nums[i];
            nums[i] ^= nums[j];
        }
}
//leetcode submit region end(Prohibit modification and deletion)

}
