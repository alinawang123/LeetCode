//You are given the root of a binary search tree (BST), where the values of exac
//tly two nodes of the tree were swapped by mistake. Recover the tree without chan
//ging its structure. 
//
// 
// Example 1: 
//
// 
//Input: root = [1,3,null,null,2]
//Output: [3,1,null,null,2]
//Explanation: 3 cannot be a left child of 1 because 3 > 1. Swapping 1 and 3 mak
//es the BST valid.
// 
//
// Example 2: 
//
// 
//Input: root = [3,1,4,null,null,2]
//Output: [2,1,4,null,null,3]
//Explanation: 2 cannot be in the right subtree of 3 because 2 < 3. Swapping 2 a
//nd 3 makes the BST valid.
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [2, 1000]. 
// -231 <= Node.val <= 231 - 1 
// 
//
// 
//Follow up: A solution using O(n) space is pretty straight-forward. Could you d
//evise a constant O(1) space solution? Related Topics Tree Depth-First Search Bin
//ary Search Tree Binary Tree 
// 👍 3437 👎 131

import java.util.logging.Logger;
public class _99_RecoverBinarySearchTree{
    private static final Logger logger = Logger.getLogger(_99_RecoverBinarySearchTree .class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        Solution solution = new _99_RecoverBinarySearchTree().new Solution();
        // assert solution == ;
        logger.warning(String.valueOf(solution));
        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
    }
    //leetcode submit region begin(Prohibit modification and deletion)

    public class TreeNode {
        int val;
        _98_ValidateBinarySearchTree.TreeNode left;
        _98_ValidateBinarySearchTree.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, _98_ValidateBinarySearchTree.TreeNode left, _98_ValidateBinarySearchTree.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

class Solution {
    public void recoverTree(TreeNode root) {
        
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
