//Given an m x n grid of characters board and a string word, return true if word
// exists in the grid. 
//
// The word can be constructed from letters of sequentially adjacent cells, wher
//e adjacent cells are horizontally or vertically neighboring. The same letter cel
//l may not be used more than once. 
//
// 
// Example 1: 
//
// 
//Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word =
// "ABCCED"
//Output: true
// 
//
// Example 2: 
//
// 
//Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word =
// "SEE"
//Output: true
// 
//
// Example 3: 
//
// 
//Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word =
// "ABCB"
//Output: false
// 
//
// 
// Constraints: 
//
// 
// m == board.length 
// n = board[i].length 
// 1 <= m, n <= 6 
// 1 <= word.length <= 15 
// board and word consists of only lowercase and uppercase English letters. 
// 
//
// 
// Follow up: Could you use search pruning to make your solution faster with a l
//arger board? 
// Related Topics Array Backtracking Matrix 
// 👍 7775 👎 294

import java.util.logging.Logger;

public class _79_WordSearch {
  private static final Logger logger = Logger.getLogger(_79_WordSearch.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _79_WordSearch().new Solution();
    char[][] board = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
    String word = "ABCCED";
    solution.exist(board, word);
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {

    public boolean exist(char[][] board, String word) {
      if(board == null || board.length ==0 || board[0].length == 0 ||word == null) return false;
      int row = board.length;
      int col = board[0].length;
      for (int i = 0; i < row; i++) {
        for (int j = 0; j < col; j++) {
          if(board[i][j] == word.charAt(0) && backtrack(board, word, 0, i, j)) {
            return true;
          }
        }
      }
      return false;
    }

    public boolean backtrack(char[][] board, String word, int start, int row, int col) {
      if(start == word.length()) return true;
      if(row<0|| row>=board.length|| col<0 || col>=board[0].length) return false;
      char c = board[row][col];
      if(c == '*') return false;
      if(board[row][col] == word.charAt(start)) {
        board[row][col] = '*';
        if(backtrack(board, word, start+1, row-1, col)||
                backtrack(board, word, start+1, row+1, col)||
                backtrack(board, word, start+1, row, col-1)||
                backtrack(board, word, start+1, row, col+1)) {
          return true;
        }
        board[row][col] = c;
      }
      return false;
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

