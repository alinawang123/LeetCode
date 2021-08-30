//Given the head of a sorted linked list, delete all duplicates such that each e
//lement appears only once. Return the linked list sorted as well. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,1,2]
//Output: [1,2]
// 
//
// Example 2: 
//
// 
//Input: head = [1,1,2,3,3]
//Output: [1,2,3]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range [0, 300]. 
// -100 <= Node.val <= 100 
// The list is guaranteed to be sorted in ascending order. 
// 
// Related Topics Linked List 
// 👍 3118 👎 155

import java.util.logging.Logger;

public class _83_RemoveDuplicatesFromSortedList {
  private static final Logger logger = Logger.getLogger(_83_RemoveDuplicatesFromSortedList.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _83_RemoveDuplicatesFromSortedList().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }
  //leetcode submit region begin(Prohibit modification and deletion)

  /**
   * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode()
   * {} ListNode(int val) { this.val = val; } ListNode(int val, ListNode next) { this.val = val;
   * this.next = next; } }
   */
  class Solution {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {
      }
      ListNode(int val) {
        this.val = val;
      }
      ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
      }
    }

    public ListNode deleteDuplicates(ListNode head) {
      if(head==null||head.next==null) return head;
      ListNode cur = head;
      while (cur.next != null) {
        if (cur.val == cur.next.val) {
          cur.next = cur.next.next;
        } else {
          cur = cur.next;
        }
      }
      return head;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
