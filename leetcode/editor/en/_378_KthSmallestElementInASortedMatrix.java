////Given an n x n matrix where each of the rows and columns are sorted in ascendi
////ng order, return the kth smallest element in the matrix.
////
//// Note that it is the kth smallest element in the sorted order, not the kth dis
////tinct element.
////
////
//// Example 1:
////
////
////Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
////Output: 13
////Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the
//// 8th smallest number is 13
////
////
//// Example 2:
////
////
////Input: matrix = [[-5]], k = 1
////Output: -5
////
////
////
//// Constraints:
////
////
//// n == matrix.length
//// n == matrix[i].length
//// 1 <= n <= 300
//// -109 <= matrix[i][j] <= 109
//// All the rows and columns of matrix are guaranteed to be sorted in non-decreas
////ing order.
//// 1 <= k <= n2
////
//// Related Topics Array Binary Search Sorting Heap (Priority Queue) Matrix
//// 👍 4694 👎 209
//
//import java.util.logging.Logger;
//public class _378_KthSmallestElementInASortedMatrix{
//    private static final Logger logger = Logger.getLogger(_378_KthSmallestElementInASortedMatrix .class.toString());
//    public static void main(String[] args) {
//        long startTimeMillis = System.currentTimeMillis();
//        Solution solution = new _378_KthSmallestElementInASortedMatrix().new Solution();
//        // assert solution == ;
//        logger.warning(String.valueOf(solution));
//        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
//    }
//    //leetcode submit region begin(Prohibit modification and deletion)
//class Solution {
//    public int kthSmallest(int[][] matrix, int k) {
//
//    }
//}
////leetcode submit region end(Prohibit modification and deletion)
//
//}
