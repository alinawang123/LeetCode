//Given the root of a binary tree, return the level order traversal of its nodes
//' values. (i.e., from left to right, level by level). 
//
// 
// Example 1: 
//
// 
//Input: root = [3,9,20,null,null,15,7]
//Output: [[3],[9,20],[15,7]]
// 
//
// Example 2: 
//
// 
//Input: root = [1]
//Output: [[1]]
// 
//
// Example 3: 
//
// 
//Input: root = []
//Output: []
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 2000]. 
// -1000 <= Node.val <= 1000 
// 
// Related Topics Tree Breadth-First Search Binary Tree 
// 👍 6422 👎 127

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.logging.Logger;

public class _102_BinaryTreeLevelOrderTraversal {
  private static final Logger logger = Logger.getLogger(_102_BinaryTreeLevelOrderTraversal.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _102_BinaryTreeLevelOrderTraversal().new Solution();
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
    public List<List<Integer>> levelOrder(TreeNode root) {
      List<List<Integer>> res = new ArrayList<List<Integer>>();
      helper(res,root,0 );
      return res;
    }

    private void helper (List<List<Integer>> res, TreeNode root, int height) {
      if (root == null) return;
      if(height>= res.size()) {
        res.add(new ArrayList<>());
      }
      res.get(height).add(root.val);
      helper(res, root.right, height+1);
      helper(res, root.left, height+1);
    }
  }


//leetcode submit region end(Prohibit modification and deletion)
//public List<List<Integer>> levelOrder(TreeNode root) {
//  List<List<Integer>> res = new ArrayList<List<Integer>>();
//  Queue<TreeNode> queue =  new LinkedList();
//  queue.offer(root);
//  while(!queue.isEmpty()) {
//    List<Integer> temp = new ArrayList<>();
//    int i = 0;
//    while(i < queue.size()){
//      TreeNode node = queue.poll();
//      temp.add(node.val);
//      if(node.left != null) queue.add(node.left);
//      if(node.right != null) queue.add(node.right);
//      i++;
//    }
//    res.add(temp);
//  }
//  return res;
//}
}
