//Given two integer arrays preorder and inorder where preorder is the preorder t
//raversal of a binary tree and inorder is the inorder traversal of the same tree,
// construct and return the binary tree. 
//
// 
// Example 1: 
//
// 
//Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
//Output: [3,9,20,null,null,15,7]
// 
//
// Example 2: 
//
// 
//Input: preorder = [-1], inorder = [-1]
//Output: [-1]
// 
//
// 
// Constraints: 
//
// 
// 1 <= preorder.length <= 3000 
// inorder.length == preorder.length 
// -3000 <= preorder[i], inorder[i] <= 3000 
// preorder and inorder consist of unique values. 
// Each value of inorder also appears in preorder. 
// preorder is guaranteed to be the preorder traversal of the tree. 
// inorder is guaranteed to be the inorder traversal of the tree. 
// 
// Related Topics Array Hash Table Divide and Conquer Tree Binary Tree 
// 👍 7004 👎 174

import java.time.temporal.Temporal;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class _105_ConstructBinaryTreeFromPreorderAndInorderTraversal {
  private static final Logger logger = Logger.getLogger(_105_ConstructBinaryTreeFromPreorderAndInorderTraversal.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _105_ConstructBinaryTreeFromPreorderAndInorderTraversal().new Solution();
    int[] preorder = {3, 9, 20, 15, 7};
    int[] inorder = {9, 3, 15, 20, 7};
    solution.buildTree(preorder,inorder);
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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
      Map<Integer, Integer> map = new HashMap<Integer, Integer>();

      for(int i = 0; i < inorder.length; i++) {
        map.put(inorder[i], i);
      }

      TreeNode root = buildTree(preorder, 0, preorder.length - 1, 0, inorder.length - 1, map);
      return root;
    }

    public TreeNode buildTree(int[] preorder, int preStart, int preEnd, int inStart, int inEnd, Map<Integer, Integer> inMap) {
      if(preStart > preEnd || inStart > inEnd) return null;

      TreeNode root = new TreeNode(preorder[preStart]);
      int inRoot = inMap.get(root.val);
      int numsLeft = inRoot - inStart;

      root.left = buildTree(preorder, preStart + 1, preStart + numsLeft,  inStart, inRoot - 1, inMap);
      root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd, inRoot + 1, inEnd, inMap);

      return root;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
