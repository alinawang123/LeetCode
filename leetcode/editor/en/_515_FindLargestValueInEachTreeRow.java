//Given the root of a binary tree, return an array of the largest value in each 
//row of the tree (0-indexed). 
//
// 
//
// 
// Example 1: 
//
// 
//Input: root = [1,3,2,5,3,null,9]
//Output: [1,3,9]
// 
//
// Example 2: 
//
// 
//Input: root = [1,2,3]
//Output: [1,3]
// 
//
// Example 3: 
//
// 
//Input: root = [1]
//Output: [1]
// 
//
// Example 4: 
//
// 
//Input: root = [1,null,2]
//Output: [1,2]
// 
//
// Example 5: 
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
// The number of nodes in the tree will be in the range [0, 104]. 
// -231 <= Node.val <= 231 - 1 
// 
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 
// 👍 1700 👎 76

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
public class _515_FindLargestValueInEachTreeRow{
    private static final Logger logger = Logger.getLogger(_515_FindLargestValueInEachTreeRow .class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        Solution solution = new _515_FindLargestValueInEachTreeRow().new Solution();
        // assert solution == ;
        logger.warning(String.valueOf(solution));
        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
    }
    //leetcode submit region begin(Prohibit modification and deletion)

  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        levelHelper(res, root, 0);
        return res;
    }

    public void levelHelper(List<Integer> res, TreeNode root, int height) {
        if (root == null) return;
        if (height >= res.size()) {
            res.add(Integer.MIN_VALUE);
        }
        res.set(height, Math.max(root.val,res.get(height)));
        levelHelper(res, root.left, height + 1);
        levelHelper(res, root.right, height + 1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
