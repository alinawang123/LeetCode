//There is an m x n rectangular island that borders both the Pacific Ocean and A
//tlantic Ocean. The Pacific Ocean touches the island's left and top edges, and th
//e Atlantic Ocean touches the island's right and bottom edges. 
//
// The island is partitioned into a grid of square cells. You are given an m x n
// integer matrix heights where heights[r][c] represents the height above sea leve
//l of the cell at coordinate (r, c). 
//
// The island receives a lot of rain, and the rain water can flow to neighboring
// cells directly north, south, east, and west if the neighboring cell's height is
// less than or equal to the current cell's height. Water can flow from any cell a
//djacent to an ocean into the ocean. 
//
// Return a 2D list of grid coordinates result where result[i] = [ri, ci] denote
//s that rain water can flow from cell (ri, ci) to both the Pacific and Atlantic o
//ceans. 
//
// 
// Example 1: 
//
// 
//Input: heights = [[1,2,2,3,5],[3,2,3,4,4],[2,4,5,3,1],[6,7,1,4,5],[5,1,1,2,4]]
//
//Output: [[0,4],[1,3],[1,4],[2,2],[3,0],[3,1],[4,0]]
// 
//
// Example 2: 
//
// 
//Input: heights = [[2,1],[1,2]]
//Output: [[0,0],[0,1],[1,0],[1,1]]
// 
//
// 
// Constraints: 
//
// 
// m == heights.length 
// n == heights[r].length 
// 1 <= m, n <= 200 
// 0 <= heights[r][c] <= 105 
// 
// Related Topics Array Depth-First Search Breadth-First Search Matrix 
// 👍 2849 👎 681

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.logging.Logger;

public class _417_PacificAtlanticWaterFlow {
  private static final Logger logger = Logger.getLogger(_417_PacificAtlanticWaterFlow.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _417_PacificAtlanticWaterFlow().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
      if (heights.length == 0 || heights[0].length == 0) {
        return new ArrayList<>();
      }
      int m = heights.length;
      int n = heights[0].length;
      boolean[][] canReachP = new boolean[m][n];
      boolean[][] canReachA = new boolean[m][n];

      for (int i = 0; i < m; i++) {
        dfs(heights, canReachP, i, 0);
        dfs(heights, canReachA, i, n - 1);
      }
      for (int i = 0; i < n; i++) {
        dfs(heights, canReachP, 0, i);
        dfs(heights, canReachA, m-1, i);
      }
      List<List<Integer>> res = new ArrayList<>();
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          if (canReachP[i][j] && canReachA[i][j]) {
            res.add(Arrays.asList(i, j));
          }
        }
      }
      return res;
    }

    private void dfs(int[][] heights, boolean[][] canReach, int row, int column){
      if(canReach[row][column]) return;
      canReach[row][column]=true;
      if(row-1>=0&&heights[row-1][column]>=heights[row][column]){dfs(heights,canReach,row-1,column);}
      if(column-1>=0&&heights[row][column-1]>=heights[row][column]){dfs(heights,canReach,row,column-1);}
      if(row+1<heights.length&&heights[row+1][column]>=heights[row][column]){dfs(heights,canReach,row+1,column);}
      if(column+1<heights[0].length&&heights[row][column+1]>=heights[row][column]){dfs(heights,canReach, row,column+1);}
    }
  }


//    private final int[][] DIRECTIONS = new int[][]{{0, 1}, {1, 0}, {-1, 0}, {0, -1}};
//
//    public List<List<Integer>> pacificAtlantic(int[][] heights) {
//      if (heights.length == 0 || heights[0].length == 0) {
//        return new ArrayList<>();
//      }
//      int n = heights.length;
//      int m = heights[0].length;
//
//      Queue<int[]> queuePacific = new LinkedList<>();
//      Queue<int[]> queueAtlantic = new LinkedList<>();
//
//      for (int i = 0; i < n; i++) {
//        queuePacific.offer(new int[]{i, 0});
//        queueAtlantic.add(new int[]{i, m - 1});
//      }
//      for (int i = 0; i < m; i++) {
//        queuePacific.offer(new int[]{0, i});
//        queueAtlantic.add(new int[]{n - 1, i});
//      }
//      boolean[][] pacific = bfs(queuePacific, n, m, heights);
//      boolean[][] atlantic = bfs(queueAtlantic, n, m, heights);
//
//      List<List<Integer>> result = new ArrayList<>();
//
//      for (int i = 0; i < n; i++) {
//        for (int j = 0; j < m; j++) {
//          if (pacific[i][j] && atlantic[i][j]) {
//            result.add(Arrays.asList(i, j));
//          }
//        }
//      }
//      return result;
//    }
//
//    private boolean[][] bfs(Queue<int[]> queue, int n, int m, int[][] heights) {
//      boolean[][] reachable = new boolean[n][m];
//      while (!queue.isEmpty()) {
//        int[] cell = queue.poll();
//        reachable[cell[0]][cell[1]] = true;
//        for (int[] dir : DIRECTIONS) {
//          int newRow = cell[0] + dir[0];
//          int newCol = cell[1] + dir[1];
//          if (newRow < 0 || newRow >= n || newCol < 0 || newCol >= m) {
//            continue;
//          }
//          if (reachable[newRow][newCol]) {
//            continue;
//          }
//          if (heights[newRow][newCol] < heights[cell[0]][cell[1]]) {
//            continue;
//          }
//          queue.offer(new int[]{newRow, newCol});
//        }
//      }
//      return reachable;
//    }
//leetcode submit region end(Prohibit modification and deletion)

}