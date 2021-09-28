//Given a linked list, reverse the nodes of a linked list k at a time and return
// its modified list. 
//
// k is a positive integer and is less than or equal to the length of the linked
// list. If the number of nodes is not a multiple of k then left-out nodes, in the
// end, should remain as it is. 
//
// You may not alter the values in the list's nodes, only nodes themselves may b
//e changed. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3,4,5], k = 2
//Output: [2,1,4,3,5]
// 
//
// Example 2: 
//
// 
//Input: head = [1,2,3,4,5], k = 3
//Output: [3,2,1,4,5]
// 
//
// Example 3: 
//
// 
//Input: head = [1,2,3,4,5], k = 1
//Output: [1,2,3,4,5]
// 
//
// Example 4: 
//
// 
//Input: head = [1], k = 1
//Output: [1]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range sz. 
// 1 <= sz <= 5000 
// 0 <= Node.val <= 1000 
// 1 <= k <= sz 
// 
//
// 
//Follow-up: Can you solve the problem in O(1) extra memory space? Related Topic
//s Linked List Recursion 
// 👍 5029 👎 444

import java.util.logging.Logger;

public class _25_ReverseNodesInKGroup {
  private static final Logger logger = Logger.getLogger(_25_ReverseNodesInKGroup.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _25_ReverseNodesInKGroup().new Solution();
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

    public ListNode reverseKGroup(ListNode head, int k) {
      if (k == 1) return head;
      ListNode curr = head;
      int count = 0;
      while (curr != null) { // find the size of the list
        curr = curr.next;
        count++;
      }
      int n = count / k;
      for (int i = 0; i < n; i++) {
        head = reverseBetween(head, i * k + 1, i * k + k);
      }
      return head;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
      if (head == null || left == right) return head;
      ListNode dummy = new ListNode(0);
      ListNode pre = dummy;
      dummy.next = head;
      for (int i = 0; i < left - 1; i++) {
        pre = pre.next;
      }
      ListNode start = pre.next;
      ListNode then = start.next;
      for (int i = 0; i < right - left; i++) {
        start.next = then.next;
        then.next = pre.next;
        pre.next = then;
        then = start.next;
      }
      return dummy.next;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
