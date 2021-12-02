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
    char[][] board = new char[][]{{'a', 'a', 'a', 'a'}, {'a', 'a', 'a', 'a'}, {'a', 'a', 'a', 'a'}};
    String word = "aaaaaaaaaaaaa";
    solution.exist(board, word);
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    private boolean[][] visited;

    public boolean exist(char[][] board, String word) {
      if (board == null || board.length == 0 || board[0].length == 0) {
        return false;
      }
      visited = new boolean[board.length][board[0].length];
      for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
          if ((board[i][j] == word.charAt(0)) && backtrack(board, word, 0, i, j, visited)) {
            return true;
          }
        }
      }
      return false;

    }

    public boolean backtrack(char[][] board, String word, int start, int row, int col,
                             boolean[][] visited) {
      if (start == word.length()) {
        return true;
      }
      if ((row < 0 || col < 0 || row >= board.length || col >= board[0].length) || board[row][col] != word.charAt(start) || visited[row][col]) {
        return false;
      }
      visited[row][col] = true;
      if (backtrack(board, word, start + 1, row - 1, col, visited)
          || backtrack(board, word, start + 1, row + 1, col, visited)
          || backtrack(board, word, start + 1, row, col - 1, visited)
          || backtrack(board, word, start + 1, row, col + 1, visited)) {
        return true;
      }
      visited[row][col] = false;
      return false;
    }
  }
}
//leetcode submit region end(Prohibit modification and deletion)

