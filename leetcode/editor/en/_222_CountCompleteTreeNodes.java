//Given the root of a complete binary tree, return the number of the nodes in th
//e tree. 
//
// According to Wikipedia, every level, except possibly the last, is completely 
//filled in a complete binary tree, and all nodes in the last level are as far lef
//t as possible. It can have between 1 and 2h nodes inclusive at the last level h.
// 
//
// Design an algorithm that runs in less than O(n) time complexity. 
//
// 
// Example 1: 
//
// 
//Input: root = [1,2,3,4,5,6]
//Output: 6
// 
//
// Example 2: 
//
// 
//Input: root = []
//Output: 0
// 
//
// Example 3: 
//
// 
//Input: root = [1]
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 5 * 104]. 
// 0 <= Node.val <= 5 * 104 
// The tree is guaranteed to be complete. 
// 
// Related Topics Binary Search Tree Depth-First Search Binary Tree 
// 👍 4067 👎 293

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class _222_CountCompleteTreeNodes {
  private static final Logger logger = Logger.getLogger(_222_CountCompleteTreeNodes.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _222_CountCompleteTreeNodes().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }
  //leetcode submit region begin(Prohibit modification and deletion)

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
  }

  class Solution {
    public int countNodes(TreeNode root) {
      if(root == null) return 0;

      int left = getHeightLeft(root);
      int right = getHeightRight(root);

      //If left and right are equal it means that the tree is complete and hence go for 2^h -1.
      if(left == right) return ((2<<(left)) -1);

        //else recursively calculate the number of nodes in left and right and add 1 for root.
      else return countNodes(root.left)+ countNodes(root.right)+1;
    }


    public int getHeightLeft(TreeNode root){
      int count=0;
      while(root.left!=null){
        count++;
        root = root.left;
      }
      return count;
    }


    public int getHeightRight(TreeNode root){
      int count=0;
      while(root.right!=null){
        count++;
        root = root.right;
      }
      return count;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
