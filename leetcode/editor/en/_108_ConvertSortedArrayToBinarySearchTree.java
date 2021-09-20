//Given an integer array nums where the elements are sorted in ascending order, 
//convert it to a height-balanced binary search tree. 
//
// A height-balanced binary tree is a binary tree in which the depth of the two 
//subtrees of every node never differs by more than one. 
//
// 
// Example 1: 
//
// 
//Input: nums = [-10,-3,0,5,9]
//Output: [0,-3,9,-10,null,5]
//Explanation: [0,-10,5,null,-3,null,9] is also accepted:
//
// 
//
// Example 2: 
//
// 
//Input: nums = [1,3]
//Output: [3,1]
//Explanation: [1,3] and [3,1] are both a height-balanced BSTs.
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 104 
// -104 <= nums[i] <= 104 
// nums is sorted in a strictly increasing order. 
// 
// Related Topics Array Divide and Conquer Tree Binary Search Tree Binary Tree 
// 👍 4743 👎 306

import java.util.logging.Logger;

public class _108_ConvertSortedArrayToBinarySearchTree {
  private static final Logger logger = Logger.getLogger(_108_ConvertSortedArrayToBinarySearchTree.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _108_ConvertSortedArrayToBinarySearchTree().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }
  //leetcode submit region begin(Prohibit modification and deletion)

  /**
   * Definition for a binary tree node. public class TreeNode { int val; TreeNode left; TreeNode
   * right; TreeNode() {} TreeNode(int val) { this.val = val; } TreeNode(int val, TreeNode left,
   * TreeNode right) { this.val = val; this.left = left; this.right = right; } }
   */
  class Solution {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      TreeNode() {
      }

      TreeNode(int val) {
        this.val = val;
      }

      TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
      }

      public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
          return null;
        }
        TreeNode head = helper(nums, 0, nums.length - 1);
        return head;
      }

      public TreeNode helper(int[] num, int low, int high) {
        if (low > high) {
          return null;
        }
        int mid = (low + high) / 2;
        TreeNode node = new TreeNode(num[mid]);
        node.left = helper(num, low, mid - 1);
        node.right = helper(num, mid + 1, high);
        return node;
      }
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
