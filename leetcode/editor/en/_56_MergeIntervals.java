//Given an array of intervals where intervals[i] = [starti, endi], merge all ove
//rlapping intervals, and return an array of the non-overlapping intervals that co
//ver all the intervals in the input. 
//
// 
// Example 1: 
//
// 
//Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
//Output: [[1,6],[8,10],[15,18]]
//Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
// 
//
// Example 2: 
//
// 
//Input: intervals = [[1,4],[4,5]]
//Output: [[1,5]]
//Explanation: Intervals [1,4] and [4,5] are considered overlapping.
// 
//
// 
// Constraints: 
//
// 
// 1 <= intervals.length <= 104 
// intervals[i].length == 2 
// 0 <= starti <= endi <= 104 
// 
// Related Topics Array Sorting 
// 👍 10556 👎 455

import java.security.cert.CertPath;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
public class _56_MergeIntervals{
    private static final Logger logger = Logger.getLogger(_56_MergeIntervals .class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        Solution solution = new _56_MergeIntervals().new Solution();
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        System.out.println(solution.merge(intervals));
        logger.warning(String.valueOf(solution));
        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] merge(int[][] intervals) {
            List<int[]> output = new ArrayList<>();
            Arrays.sort(intervals, Comparator.comparingInt(a-> a[0]));
            int[] temp = intervals[0];
            output.add(temp);
            for( int[] interval : intervals) {
                if(interval[0] > temp[1]) {
                    temp = interval;
                    output.add(temp);
                } else {
                    temp[0] = Math.min(temp[0], interval[0]);
                    temp[1] = Math.max(temp[1], interval[1]);
                }
            }
            return output.toArray(new int[output.size()][2]);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

