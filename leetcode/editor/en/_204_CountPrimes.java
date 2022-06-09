//Given an integer n, return the number of prime numbers that are strictly less 
//than n. 
//
// 
// Example 1: 
//
// 
//Input: n = 10
//Output: 4
//Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
// 
//
// Example 2: 
//
// 
//Input: n = 0
//Output: 0
// 
//
// Example 3: 
//
// 
//Input: n = 1
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// 0 <= n <= 5 * 106 
// 
// Related Topics Array Math Enumeration Number Theory 
// 👍 4898 👎 1018

import java.util.logging.Logger;
public class _204_CountPrimes{
    private static final Logger logger = Logger.getLogger(_204_CountPrimes .class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        Solution solution = new _204_CountPrimes().new Solution();
        // assert solution == ;
        logger.warning(String.valueOf(solution));
        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countPrimes(int n) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
