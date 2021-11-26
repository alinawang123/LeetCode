//Given the root of a binary tree, return the average value of the nodes on each
// level in the form of an array. Answers within 10-5 of the actual answer will be
// accepted.
// 
// Example 1: 
//
// 
//Input: root = [3,9,20,null,null,15,7]
//Output: [3.00000,14.50000,11.00000]
//Explanation: The average value of nodes on level 0 is 3, on level 1 is 14.5, a
//nd on level 2 is 11.
//Hence return [3, 14.5, 11].
// 
//
// Example 2: 
//
// 
//Input: root = [3,9,20,15,7]
//Output: [3.00000,14.50000,11.00000]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 104]. 
// -231 <= Node.val <= 231 - 1 
// 
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 
// 👍 2525 👎 219

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

public class _637_AverageOfLevelsInBinaryTree {
  private static final Logger logger = Logger.getLogger(_637_AverageOfLevelsInBinaryTree.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _637_AverageOfLevelsInBinaryTree().new Solution();
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
    public List<Double> averageOfLevels(TreeNode root) {
      List<Double> sum = new ArrayList<>();
      List<Double> count = new ArrayList<>();
      List<Double> average = new ArrayList<>();
      levelHelper(root, sum, count, 0);
      for (int i = 0; i < sum.size(); i++) {
        average.add(sum.get(i) / count.get(i));
      }
      return average;
    }

    public void levelHelper(TreeNode root, List<Double> sum, List<Double> count, int height) {
      if (root == null) return;
      if (height >= sum.size()) {
        sum.add(0.0);
        count.add(0.0);
      }
      sum.set(height, sum.get(height) + root.val);
      count.set(height, count.get(height) + 1);
      levelHelper(root.left, sum, count, height + 1);
      levelHelper(root.right, sum, count, height + 1);
    }
  }
//leetcode submit region end(Prohibit modification and deletion)

}
