//Serialization is the process of converting a data structure or object into a s
//equence of bits so that it can be stored in a file or memory buffer, or transmit
//ted across a network connection link to be reconstructed later in the same or an
//other computer environment. 
//
// Design an algorithm to serialize and deserialize a binary tree. There is no r
//estriction on how your serialization/deserialization algorithm should work. You 
//just need to ensure that a binary tree can be serialized to a string and this st
//ring can be deserialized to the original tree structure. 
//
// Clarification: The input/output format is the same as how LeetCode serializes
// a binary tree. You do not necessarily need to follow this format, so please be 
//creative and come up with different approaches yourself. 
//
// 
// Example 1: 
//
// 
//Input: root = [1,2,3,null,null,4,5]
//Output: [1,2,3,null,null,4,5]
// 
//
// Example 2: 
//
// 
//Input: root = []
//Output: []
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
//Input: root = [1,2]
//Output: [1,2]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 104]. 
// -1000 <= Node.val <= 1000 
// 
// Related Topics String Tree Depth-First Search Breadth-First Search Design Bin
//ary Tree 
// 👍 5541 👎 226

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.logging.Logger;
public class _297_SerializeAndDeserializeBinaryTree{
    private static final Logger logger = Logger.getLogger(_297_SerializeAndDeserializeBinaryTree .class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        //Solution solution = new _297_SerializeAndDeserializeBinaryTree().new Solution();
        // assert solution == ;
        //logger.warning(String.valueOf(solution));
        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
    }
    //leetcode submit region begin(Prohibit modification and deletion)


  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class Codec {
        private String split = ",";
        private String na = "X";

        public String serialize(TreeNode root) {
            StringBuilder sb = new StringBuilder();
            buildString(root, sb);
            return sb.toString();
        }

        private void buildString (TreeNode root, StringBuilder sb) {
            if(root == null) sb.append(na).append(split);
            else {
                sb.append(root.val).append(split);
                buildString(root.left, sb);
                buildString(root.right, sb);
            }
        }

        public TreeNode deserialize (String data) {
            Queue<String> q = new LinkedList<>();
            q.addAll(Arrays.asList(data.split(split)));
            return buildTree(q);
        }

        private TreeNode buildTree(Queue<String> q) {
            String val = q.poll();
            if(val == na) return null;
            TreeNode root = new TreeNode(Integer.parseInt(val));
            root.left = buildTree(q);
            root.right = buildTree(q);
            return root;
        }



//    private String split = ",";
//    private String na = "X";
//    // Encodes a tree to a single string.
//    public String serialize(TreeNode root) {
//        StringBuilder sb = new StringBuilder();// use of String builder to build string of any
//        // type of value
//        buildString(root, sb);
//        return sb.toString(); //string builder to string return the string
//    }
//
//    private void buildString(TreeNode root, StringBuilder sb) {
//        if(root==null) sb.append(na).append(split);
//        else {
//            sb.append(root.val).append(split);
//            buildString(root.left, sb);
//            buildString(root.right, sb);
//        }
//    }
//    // Decodes your encoded data to tree.
//    public TreeNode deserialize(String data) {
//        Queue<String> q = new LinkedList<>();
//        q.addAll(Arrays.asList(data.split(split))); //addAll needs to remember
//       return buildTree(q);
//    }
//
//    private TreeNode buildTree(Queue<String> q) {
//        String val = q.poll();
//        if(val.equals(na)) return null;
//        TreeNode root = new TreeNode(Integer.valueOf(val));
//        root.left= buildTree(q);
//        root.right = buildTree(q);
//        return root;
//    }

}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
//leetcode submit region end(Prohibit modification and deletion)

}
