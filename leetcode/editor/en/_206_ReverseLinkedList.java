//Given the head of a singly linked list, reverse the list, and return the rever
//sed list. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3,4,5]
//Output: [5,4,3,2,1]
// 
//
// Example 2: 
//
// 
//Input: head = [1,2]
//Output: [2,1]
// 
//
// Example 3: 
//
// 
//Input: head = []
//Output: []
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is the range [0, 5000]. 
// -5000 <= Node.val <= 5000 
// 
//
// 
// Follow up: A linked list can be reversed either iteratively or recursively. C
//ould you implement both? 
// Related Topics Linked List Recursion 
// 👍 8540 👎 152

import java.util.logging.Logger;

public class _206_ReverseLinkedList {
  private static final Logger logger = Logger.getLogger(_206_ReverseLinkedList.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _206_ReverseLinkedList().new Solution();
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

    public ListNode reverseList(ListNode head) {
      if (head == null) return head;
      ListNode next = head.next;
      head.next = null;

      while (next != null) {
        ListNode temp = next.next;
        next.next = head;
        head = next;
        next = temp;
      }
      return head;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
