//The n-queens puzzle is the problem of placing n queens on an n x n chessboard 
//such that no two queens attack each other. 
//
// Given an integer n, return all distinct solutions to the n-queens puzzle. You
// may return the answer in any order. 
//
// Each solution contains a distinct board configuration of the n-queens' placem
//ent, where 'Q' and '.' both indicate a queen and an empty space, respectively. 
//
// 
// Example 1: 
//
// 
//Input: n = 4
//Output: [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]
//Explanation: There exist two distinct solutions to the 4-queens puzzle as show
//n above
// 
//
// Example 2: 
//
// 
//Input: n = 1
//Output: [["Q"]]
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 9 
// 
// Related Topics Array Backtracking 
// 👍 4505 👎 135

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

public class _51_NQueens {
  private static final Logger logger = Logger.getLogger(_51_NQueens.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _51_NQueens().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    private char queen = 'Q';

    public List<List<String>> solveNQueens(int n) {
      List<List<String>> res = new ArrayList<>();
      char[][] board = new char[n][n];
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
          board[i][j] = '.';
        }
      }
      backtrack(res, board, 0);
      return res;
    }

    private void backtrack(List<List<String>> res, char[][] board, int col) {
      if (col == board.length) {
        res.add(construct(board));
        return;
      }
      for (int i = 0; i < board.length; i++) {
        if (isValid(board, i, col)) {
          board[i][col] = queen;
          backtrack(res, board, col + 1);
          board[i][col] = '.';
        }
      }
    }

    private boolean isValid(char[][] board, int row, int col) {
      for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < col; j++) {
          if ((board[i][j] == queen) && (row + j == col + i || row + col == i + j || row == i)) {
            return false;
          }
        }
      }
      return true;
    }
    private List<String> construct(char[][] chess) {
      List<String> path = new ArrayList<>();
      for (int i = 0; i < chess.length; i++) {
        path.add(new String(chess[i]));
      }
      return path;
    }



  }
//leetcode submit region end(Prohibit modification and deletion)

}
