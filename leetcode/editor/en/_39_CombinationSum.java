//Given an array of distinct integers candidates and a target integer target, re
//turn a list of all unique combinations of candidates where the chosen numbers su
//m to target. You may return the combinations in any order. 
//
// The same number may be chosen from candidates an unlimited number of times. T
//wo combinations are unique if the frequency of at least one of the chosen number
//s is different. 
//
// It is guaranteed that the number of unique combinations that sum up to target
// is less than 150 combinations for the given input. 
//
// 
// Example 1: 
//
// 
//Input: candidates = [2,3,6,7], target = 7
//Output: [[2,2,3],[7]]
//Explanation:
//2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple ti
//mes.
//7 is a candidate, and 7 = 7.
//These are the only two combinations.
// 
//
// Example 2: 
//
// 
//Input: candidates = [2,3,5], target = 8
//Output: [[2,2,2,2],[2,3,3],[3,5]]
// 
//
// Example 3: 
//
// 
//Input: candidates = [2], target = 1
//Output: []
// 
//
// Example 4: 
//
// 
//Input: candidates = [1], target = 1
//Output: [[1]]
// 
//
// Example 5: 
//
// 
//Input: candidates = [1], target = 2
//Output: [[1,1]]
// 
//
// 
// Constraints: 
//
// 
// 1 <= candidates.length <= 30 
// 1 <= candidates[i] <= 200 
// All elements of candidates are distinct. 
// 1 <= target <= 500 
// 
// Related Topics Array Backtracking 
// 👍 8054 👎 190

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
public class _39_CombinationSum{
    private static final Logger logger = Logger.getLogger(_39_CombinationSum .class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        Solution solution = new _39_CombinationSum().new Solution();
        solution.combinationSum( new int[]{2,3,6,7}, 7);
        logger.warning(String.valueOf(solution));
        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> curList = new ArrayList<>();
        Arrays.stream(candidates).sorted();
        backtrack(output, curList, 0,  target, candidates);
        System.out.printf(output.toString());
        return output;
    }

        public void backtrack(List<List<Integer>> output, List<Integer> currList, int s,
                              int target, int[] candidates) {

            if (target==0) {
                output.add(currList);
                return;
            }

            for (int i = s; i < candidates.length; i++) {
                if(candidates[i]>target) return;
                currList.add(candidates[i]);
                backtrack(output, currList, s, target - candidates[i], candidates);
                currList.remove(currList.size()-1);
            }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
