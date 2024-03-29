//There are a total of numCourses courses you have to take, labeled from 0 to nu
//mCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai,
// bi] indicates that you must take course bi first if you want to take course ai.
// 
//
// 
// For example, the pair [0, 1], indicates that to take course 0 you have to fir
//st take course 1. 
// 
//
// Return true if you can finish all courses. Otherwise, return false. 
//
// 
// Example 1: 
//
// 
//Input: numCourses = 2, prerequisites = [[1,0]]
//Output: true
//Explanation: There are a total of 2 courses to take. 
//To take course 1 you should have finished course 0. So it is possible.
// 
//
// Example 2: 
//
// 
//Input: numCourses = 2, prerequisites = [[1,0],[0,1]]
//Output: false
//Explanation: There are a total of 2 courses to take. 
//To take course 1 you should have finished course 0, and to take course 0 you s
//hould also have finished course 1. So it is impossible.
// 
//
// 
// Constraints: 
//
// 
// 1 <= numCourses <= 105 
// 0 <= prerequisites.length <= 5000 
// prerequisites[i].length == 2 
// 0 <= ai, bi < numCourses 
// All the pairs prerequisites[i] are unique. 
// 
// Related Topics Depth-First Search Breadth-First Search Graph Topological Sort
// 
// 👍 7754 👎 310

import java.util.*;
import java.util.logging.Logger;

public class _207_CourseSchedule {
  private static final Logger logger = Logger.getLogger(_207_CourseSchedule.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _207_CourseSchedule().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {

      public boolean canFinish(int numCourses, int[][] prerequisites) {
          List<List<Integer>> adjacency = new ArrayList<>();
          for(int i=0;i<numCourses;i++)
              adjacency.add(new ArrayList<>());
          int[] flags = new int[numCourses];
          for (int[] prerequisite : prerequisites) {
              adjacency.get(prerequisite[1]).add(prerequisite[0]);
          }
          for(int i=0; i<numCourses; i++){
              if(!dfs(adjacency,flags,i))
                  return false;
          }
          return true;
      }

      private boolean dfs(List<List<Integer>> adjacency, int[] flags, int i) {
          if (flags[i] == 1) {
              return false;
          } else if(flags[i] == -1){
            return true;
          }
          flags[i] = 1;
          for (Integer j : adjacency.get(i)) {
              if (!dfs(adjacency, flags, j)){
                  return false;
              }
          }
          flags[i] = -1;
          return true;
      }
//    public boolean canFinish(int numCourses, int[][] prerequisites) {
//        int[][] table = new int[numCourses][numCourses];//BFS method
//        int[] indegree = new int[numCourses];
//        for (int i = 0; i < prerequisites.length; i++) {
//            int cur = prerequisites[i][0];
//            int pre = prerequisites[i][1];
//            if(table[cur][pre]==0){
//                indegree[cur]++;
//            }
//            table[cur][pre] = 1;
//        }
//        int count = 0;
//        Queue<Integer> queue = new LinkedList<>();
//        for (int i = 0; i < numCourses; i++) {
//            if (indegree[i] == 0) {
//                queue.offer(i);
//            }
//        }
//        while(!queue.isEmpty()){
//            int course = queue.poll();
//            count++;
//            for (int i = 0; i < numCourses; i++) {
//                if(table[i][course] != 0) {
//                    indegree[i]--;
//                    if(indegree[i] ==0){
//                        queue.offer(i);
//                    }
//                }
//            }
//        }
//        return count==numCourses;
//    }

  //Shorter Version of BFS using adj list

//    public boolean canFinish(int numCourses, int[][] prereq) {
//      List<Integer>[] adj = new List[numCourses];
//      int[] indegree = new int[numCourses];
//      for (int i = 0; i < numCourses; i++) adj[i] = new ArrayList<>();
//      for (int[] req : prereq) {
//        adj[req[1]].add(req[0]);
//        indegree[req[0]]++;
//      }
//
//      Queue<Integer> q = new LinkedList<>();
//      for (int i = 0; i < numCourses; i++)
//        if (indegree[i] == 0) q.offer(i);
//
//      int cnt = 0;
//      for (; !q.isEmpty(); cnt++)
//        for (int crs : adj[q.poll()])
//          if (--indegree[crs] == 0) q.offer(crs);
//      return cnt == numCourses;
//    }

  }
//leetcode submit region end(Prohibit modification and deletion)

}
