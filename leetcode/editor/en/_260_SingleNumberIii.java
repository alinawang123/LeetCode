//Given an integer array nums, in which exactly two elements appear only once an
//d all the other elements appear exactly twice. Find the two elements that appear
// only once. You can return the answer in any order. 
//
// You must write an algorithm that runs in linear runtime complexity and uses o
//nly constant extra space. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,2,1,3,2,5]
//Output: [3,5]
//Explanation:  [5, 3] is also a valid answer.
// 
//
// Example 2: 
//
// 
//Input: nums = [-1,0]
//Output: [-1,0]
// 
//
// Example 3: 
//
// 
//Input: nums = [0,1]
//Output: [1,0]
// 
//
// 
// Constraints: 
//
// 
// 2 <= nums.length <= 3 * 104 
// -231 <= nums[i] <= 231 - 1 
// Each integer in nums will appear twice, only two integers will appear once. 
// 
// Related Topics Array Bit Manipulation 
// 👍 3438 👎 175

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.logging.Logger;
public class _260_SingleNumberIii{
    private static final Logger logger = Logger.getLogger(_260_SingleNumberIii .class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        Solution solution = new _260_SingleNumberIii().new Solution();
        int n = 5;
        int[][] edges = new int[][] {{0,1},{0,2}, {0,3}, {1,4}};
        System.out.println(solution.singleNumber(n,edges));
        logger.warning(String.valueOf(solution));
        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean singleNumber(int n, int[][] edges) {


       List<List<Integer>> adjList = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for(int i = 0; i < edges.length; i++) {
             adjList.get(edges[i][0]).add(edges[i][1]);
             adjList.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[] visited = new boolean[n];

        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        visited[0]= true;

        while(!stack.isEmpty()){
            int q = stack.pop();
            for(int neighbor: adjList.get(q)){
               if(visited[neighbor]){
                 return false;
               }
                stack.push(neighbor);
                visited[neighbor] = true;
                adjList.get(neighbor).remove((Integer) q);
                }
            }

        for(int i = 0; i<n ; i++) {
           if(!visited[i]){
               return false;
           }
        }

        return true;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
