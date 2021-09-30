//Given an m x n matrix, return all elements of the matrix in spiral order.
//
//
// Example 1:
//
//
//Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
//Output: [1,2,3,6,9,8,7,4,5]
//
//
// Example 2:
//
//
//Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
//Output: [1,2,3,4,8,12,11,10,9,5,6,7]
//
//
//
// Constraints:
//
//
// m == matrix.length
// n == matrix[i].length
// 1 <= m, n <= 10
// -100 <= matrix[i][j] <= 100
//
// Related Topics Array Matrix Simulation
// 👍 5138 👎 728

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class _54_SpiralMatrix {
  private static final Logger logger = Logger.getLogger(_54_SpiralMatrix.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _54_SpiralMatrix().new Solution();
    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    solution.spiralOrder(matrix);
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      List<Integer> output = new LinkedList<>();
      if (matrix == null || matrix.length < 1) return output;
      int n = matrix.length, m = matrix[0].length;
      int up = 0, down = n - 1;
      int left = 0, right = m - 1;
      while (output.size() < m * n) {
        for (int i = left; i <= right && output.size() < m * n; i++) {
          output.add(matrix[up][i]);
        }
        for (int i = up + 1; i < down && output.size() < m * n; i++) {
          output.add(matrix[i][right]);
        }
        for (int i = right; i >= left && output.size() < m * n; i--) {
          output.add(matrix[down][i]);
        }
        for (int i = down - 1; i > up && output.size() < m * n; i--) {
          output.add(matrix[i][left]);
        }
        up++;
        down--;
        left++;
        right--;
      }
      //System.out.printf(output.toString());
      return output;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
