//Given a reference of a node in a connected undirected graph. 
//
// Return a deep copy (clone) of the graph. 
//
// Each node in the graph contains a value (int) and a list (List[Node]) of its 
//neighbors. 
//
// 
//class Node {
//    public int val;
//    public List<Node> neighbors;
//}
// 
//
// 
//
// Test case format: 
//
// For simplicity, each node's value is the same as the node's index (1-indexed)
//. For example, the first node with val == 1, the second node with val == 2, and 
//so on. The graph is represented in the test case using an adjacency list. 
//
// An adjacency list is a collection of unordered lists used to represent a fini
//te graph. Each list describes the set of neighbors of a node in the graph. 
//
// The given node will always be the first node with val = 1. You must return th
//e copy of the given node as a reference to the cloned graph. 
//
// 
// Example 1: 
//
// 
//Input: adjList = [[2,4],[1,3],[2,4],[1,3]]
//Output: [[2,4],[1,3],[2,4],[1,3]]
//Explanation: There are 4 nodes in the graph.
//1st node (val = 1)'s neighbors are 2nd node (val = 2) and 4th node (val = 4).
//2nd node (val = 2)'s neighbors are 1st node (val = 1) and 3rd node (val = 3).
//3rd node (val = 3)'s neighbors are 2nd node (val = 2) and 4th node (val = 4).
//4th node (val = 4)'s neighbors are 1st node (val = 1) and 3rd node (val = 3).
// 
//
// Example 2: 
//
// 
//Input: adjList = [[]]
//Output: [[]]
//Explanation: Note that the input contains one empty list. The graph consists o
//f only one node with val = 1 and it does not have any neighbors.
// 
//
// Example 3: 
//
// 
//Input: adjList = []
//Output: []
//Explanation: This an empty graph, it does not have any nodes.
// 
//
// Example 4: 
//
// 
//Input: adjList = [[2],[1]]
//Output: [[2],[1]]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the graph is in the range [0, 100]. 
// 1 <= Node.val <= 100 
// Node.val is unique for each node. 
// There are no repeated edges and no self-loops in the graph. 
// The Graph is connected and all nodes can be visited starting from the given n
//ode. 
// 
// Related Topics Hash Table Depth-First Search Breadth-First Search Graph 
// 👍 4217 👎 2039

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.jar.JarEntry;
import java.util.logging.Logger;

public class _133_CloneGraph {
  private static final Logger logger = Logger.getLogger(_133_CloneGraph.class.toString());

  public static void main(String[] args) {
    long startTimeMillis = System.currentTimeMillis();
    Solution solution = new _133_CloneGraph().new Solution();
    // assert solution == ;
    logger.warning(String.valueOf(solution));
    logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
  }

  //leetcode submit region begin(Prohibit modification and deletion)
// Definition for a Node.
  class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {
      val = 0;
      neighbors = new ArrayList<Node>();
    }

    public Node(int _val) {
      val = _val;
      neighbors = new ArrayList<Node>();
    }

    public Node(int _val, ArrayList<Node> _neighbors) {
      val = _val;
      neighbors = _neighbors;
    }
  }

  class Solution {
    private HashMap<Integer, Node> map = new HashMap<>();

    public Node cloneGraph(Node node) {
      return clone(node);
    }

    private Node clone(Node node) {
     if(node == null) return null;
     if(map.containsKey(node.val)) {
       return map.get(node.val);
     }
     Node newNode = new Node(node.val);
     map.put(node.val, newNode);
     for(Node neighbor: node.neighbors) {
       newNode.neighbors.add(clone(neighbor));
     }
     return newNode;
    }
  }
//leetcode submit region end(Prohibit modification and deletion)
//public Node cloneGraph(Node node) {
//    if (node == null) return null;
//
//    Node newNode = new Node(node.val); //new node for return
//    HashMap<Integer, Node> map = new HashMap(); //store visited nodes
//
//    map.put(newNode.val, newNode); //add first node to HashMap
//
//    LinkedList<Node> queue = new LinkedList(); //to store **original** nodes need to be visited
//    queue.add(node); //add first **original** node to queue
//
//    while (!queue.isEmpty()) { //if more nodes need to be visited
//        Node n = queue.pop(); //search first node in the queue
//        for (Node neighbor : n.neighbors) {
//            if (!map.containsKey(neighbor.val)) { //add to map and queue if this node hasn't been searched before
//                map.put(neighbor.val, new Node(neighbor.val));
//                queue.add(neighbor);
//            }
//            map.get(n.val).neighbors.add(map.get(neighbor.val)); //add neighbor to new created nodes
//        }
//    }
//
//    return newNode;
//}

  public Node cloneGraph(Node node) {
    if (node == null) return null; //validate input

    Node newNode = new Node(node.val); //create the root node to return
    HashMap<Integer, Node> map = new HashMap<>(); //store visited nodes, map the node value to
    // the node so we can get the node by its value
    map.put(newNode.val, newNode); //add first node to the map

    Queue<Node> queue = new LinkedList<>();//create a queue to store **original node** that
    // need to be visited
    queue.add(node); //add the original input node to queue

    while (!queue.isEmpty()) {
      Node n = queue.poll(); //pop the first node on the queue
      for (Node neighbor : n.neighbors) { //iterate through the node's neighbor
        if (!map.containsKey(neighbor.val)) { //check if the node's neighbor has been visited
          // if not
          // visited
          map.put(neighbor.val, new Node(neighbor.val)); //add the node's neighbor's
          // value to the map
          queue.add(neighbor); //add the original neighbor to queue
        }
        map.get(n.val).neighbors.add(map.get(neighbor.val)); //add neighbor to the new
        // created node

      }
    }
    return newNode;


  }


}
