//Given the root of a binary tree, return the length of the diameter of the tree
//. 
//
// The diameter of a binary tree is the length of the longest path between any t
//wo nodes in a tree. This path may or may not pass through the root. 
//
// The length of a path between two nodes is represented by the number of edges 
//between them. 
//
// 
// Example 1: 
//
// 
//Input: root = [1,2,3,4,5]
//Output: 3
//Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].
// 
//
// Example 2: 
//
// 
//Input: root = [1,2]
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 104]. 
// -100 <= Node.val <= 100 
// 
// Related Topics Tree Depth-First Search Binary Tree 
// 👍 6445 👎 398

import java.util.logging.Logger;

public class _543_DiameterOfBinaryTree {
  private static final Logger logger = Logger.getLogger(_543_DiameterOfBinaryTree.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _543_DiameterOfBinaryTree().new Solution();
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
    private int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return ans;
    }

    private int helper(TreeNode root){
      if(root == null) return -1;
      int leftDia = helper(root.left);
      int rightDia = helper(root.right);
      ans = Math.max(ans, leftDia+rightDia+2);
      return Math.max(leftDia+1, rightDia+1);
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
