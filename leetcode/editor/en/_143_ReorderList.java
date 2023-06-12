//You are given the head of a singly linked-list. The list can be represented
//as:
//
//
//L0 → L1 → … → Ln - 1 → Ln
//
//
// Reorder the list to be on the following form:
//
//
//L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
//
//
// You may not modify the values in the list's nodes. Only nodes themselves may
//be changed.
//
//
// Example 1:
//
//
//Input: head = [1,2,3,4]
//Output: [1,4,2,3]
//
//
// Example 2:
//
//
//Input: head = [1,2,3,4,5]
//Output: [1,5,2,4,3]
//
//
//
// Constraints:
//
//
// The number of nodes in the list is in the range [1, 5 * 10⁴].
// 1 <= Node.val <= 1000
//
//
// Related Topics Linked List Two Pointers Stack Recursion 👍 8849 👎 297


//leetcode submit region begin(Prohibit modification and deletion)

 // Definition for singly-linked list.


import java.util.HashMap;

class Solution {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public void reorderList(ListNode head) {
        HashMap<Integer, ListNode> map = new HashMap<>();
        for (int i = 1; head!= null; head= head.next, i++) {
            map.put(i, head);
        }
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        for (int i = 1, j = map.size(); j>=i; i++, j--) {
            cur.next = map.get(i);
            if(i!=j) map.get(i).next = map.get(j);
            map.get(j).next = null;
            cur = map.get(j);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)
