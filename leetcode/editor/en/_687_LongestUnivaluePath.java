//Given the root of a binary tree, return the length of the longest path, where 
//each node in the path has the same value. This path may or may not pass through 
//the root. 
//
// The length of the path between two nodes is represented by the number of edge
//s between them. 
//
// 
// Example 1: 
//
// 
//Input: root = [5,4,5,1,1,5]
//Output: 2
// 
//
// Example 2: 
//
// 
//Input: root = [1,4,5,4,4,5]
//Output: 2
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 104]. 
// -1000 <= Node.val <= 1000 
// The depth of the tree will not exceed 1000. 
// 
// Related Topics Tree Depth-First Search Binary Tree 
// 👍 2783 👎 590

import java.util.logging.Logger;

public class _687_LongestUnivaluePath {
  private static final Logger logger = Logger.getLogger(_687_LongestUnivaluePath.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _687_LongestUnivaluePath().new Solution();
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
    private int ans=0;

    public int longestUnivaluePath(TreeNode root) {
      if(root==null)return 0;
      helper(root, root.val);
      return ans;
    }

    private int helper(TreeNode root, int val) {
      if (root == null) return 0;
      int leftPath = helper(root.left, root.val);
      int rightPath = helper(root.right, root.val);
      ans = Math.max(ans, leftPath + rightPath);
      if (root.val == val) {
        return Math.max(leftPath + 1, rightPath + 1);
      } else {
        return 0;
      }
    }
//leetcode submit region end(Prohibit modification and deletion)

  }
}
