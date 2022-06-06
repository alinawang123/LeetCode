//Roman numerals are represented by seven different symbols: I, V, X, L, C, D an
//d M. 
//
// 
//Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000 
//
// For example, 2 is written as II in Roman numeral, just two one's added togeth
//er. 12 is written as XII, which is simply X + II. The number 27 is written as XX
//VII, which is XX + V + II. 
//
// Roman numerals are usually written largest to smallest from left to right. Ho
//wever, the numeral for four is not IIII. Instead, the number four is written as 
//IV. Because the one is before the five we subtract it making four. The same prin
//ciple applies to the number nine, which is written as IX. There are six instance
//s where subtraction is used: 
//
// 
// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900. 
// 
//
// Given a roman numeral, convert it to an integer. 
//
// 
// Example 1: 
//
// 
//Input: s = "III"
//Output: 3
// 
//
// Example 2: 
//
// 
//Input: s = "IV"
//Output: 4
// 
//
// Example 3: 
//
// 
//Input: s = "IX"
//Output: 9
// 
//
// Example 4: 
//
// 
//Input: s = "LVIII"
//Output: 58
//Explanation: L = 50, V= 5, III = 3.
// 
//
// Example 5: 
//
// 
//Input: s = "MCMXCIV"
//Output: 1994
//Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 15 
// s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M'). 
// It is guaranteed that s is a valid roman numeral in the range [1, 3999]. 
// 
// Related Topics Hash Table Math String 
// 👍 1587 👎 122

import java.util.HashMap;
import java.util.logging.Logger;

public class _13_RomanToInteger {
  private static final Logger logger = Logger.getLogger(_13_RomanToInteger.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _13_RomanToInteger().new Solution();
    logger.info("Solution:" + solution.romanToInt("MCMXCIV"));
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
  class Solution {
    public int romanToInt(String s) {
      if (s == null || s.length() < 1 || s.length() > 15) return -1;
      HashMap<Character, Integer> map = new HashMap<>();
      map.put('I', 1);
      map.put('V', 5);
      map.put('X', 10);
      map.put('L', 50);
      map.put('C', 100);
      map.put('D', 500);
      map.put('M', 1000);
      int result = map.get(s.charAt(s.length() - 1));
      for (int i = s.length() - 2; i >= 0; i--) {
        if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
          result += map.get(s.charAt(i));
        } else {
          result -= map.get(s.charAt(i));
        }
      }
      return result;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
