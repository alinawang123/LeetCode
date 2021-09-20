//Given the head of a linked list and an integer val, remove all the nodes of th
//e linked list that has Node.val == val, and return the new head. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,6,3,4,5,6], val = 6
//Output: [1,2,3,4,5]
// 
//
// Example 2: 
//
// 
//Input: head = [], val = 1
//Output: []
// 
//
// Example 3: 
//
// 
//Input: head = [7,7,7,7], val = 7
//Output: []
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range [0, 104]. 
// 1 <= Node.val <= 50 
// 0 <= val <= 50 
// 
// Related Topics Linked List Recursion 
// 👍 3366 👎 135

import java.util.logging.Logger;
public class _203_RemoveLinkedListElements{
    private static final Logger logger = Logger.getLogger(_203_RemoveLinkedListElements .class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        Solution solution = new _203_RemoveLinkedListElements().new Solution();
        // assert solution == ;
        logger.warning(String.valueOf(solution));
        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode removeElements(ListNode head, int val) {
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
