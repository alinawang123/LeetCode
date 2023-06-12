//You are given an array of k linked-lists lists, each linked-list is sorted in 
//ascending order. 
//
// Merge all the linked-lists into one sorted linked-list and return it. 
//
// 
// Example 1: 
//
// 
//Input: lists = [[1,4,5],[1,3,4],[2,6]]
//Output: [1,1,2,3,4,4,5,6]
//Explanation: The linked-lists are:
//[
//  1->4->5,
//  1->3->4,
//  2->6
//]
//merging them into one sorted list:
//1->1->2->3->4->4->5->6
// 
//
// Example 2: 
//
// 
//Input: lists = []
//Output: []
// 
//
// Example 3: 
//
// 
//Input: lists = [[]]
//Output: []
// 
//
// 
// Constraints: 
//
// 
// k == lists.length 
// 0 <= k <= 10^4 
// 0 <= lists[i].length <= 500 
// -10^4 <= lists[i][j] <= 10^4 
// lists[i] is sorted in ascending order. 
// The sum of lists[i].length won't exceed 10^4. 
// 
// Related Topics Linked List Divide and Conquer Heap (Priority Queue) Merge Sor
//t 
// 👍 8722 👎 389

import java.util.PriorityQueue;
import java.util.logging.Logger;

public class _23_MergeKSortedLists {
  private static final Logger logger = Logger.getLogger(_23_MergeKSortedLists.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _23_MergeKSortedLists().new Solution();
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

    public ListNode mergeKLists(ListNode[] lists) {
      // corner case
      if(lists == null || lists.length == 0) return null;

      PriorityQueue<ListNode> queue = new PriorityQueue<>((o1, o2) -> o1.val - o2.val);
      for(ListNode node : lists) {
        queue.add(node);
      }
      ListNode dummy = new ListNode();
      ListNode cur = dummy;
      while(!queue.isEmpty()){
        cur.next = queue.poll();
        cur = cur.next;
        if(cur.next!= null) queue.add(cur.next);
      }
      return dummy.next;
    }
//
//    // return new head after merging list[left : right]
//    public ListNode merge(ListNode[] lists, int left, int right){
//      // base case
//      if(left == right) return lists[left];
//
//      int mid = left + (right - left)/2;
//      ListNode l1 = merge(lists, left, mid); // merge [left : mid]
//      ListNode l2 = merge(lists, mid + 1, right); // merge [mid + 1 : right]
//
//      return mergeTwoLists(l1, l2);
//    }
//    public ListNode mergeTwoLists(ListNode l1,ListNode l2) {
//      if(l1 == null) return l2;
//      else if(l2 == null) return l1;
//      ListNode dummyHead = new ListNode(0);
//      ListNode curr = dummyHead;
//      while (l1 != null && l2 != null) {
//        if (l1.val <= l2.val) {
//          curr.next = l1;
//          l1 = l1.next;
//        } else {
//          curr.next = l2;
//          l2 = l2.next;
//        }
//        curr = curr.next;
//      }
//      if (l1 != null) curr.next = l1;
//      if (l2 != null) curr.next = l2;
//      return dummyHead.next;
//    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
