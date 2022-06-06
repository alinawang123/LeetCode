//Design a stack that supports push, pop, top, and retrieving the minimum elemen
//t in constant time. 
//
// Implement the MinStack class: 
//
// 
// MinStack() initializes the stack object. 
// void push(int val) pushes the element val onto the stack. 
// void pop() removes the element on the top of the stack. 
// int top() gets the top element of the stack. 
// int getMin() retrieves the minimum element in the stack. 
// 
//
// 
// Example 1: 
//
// 
//Input
//["MinStack","push","push","push","getMin","pop","top","getMin"]
//[[],[-2],[0],[-3],[],[],[],[]]
//
//Output
//[null,null,null,null,-3,null,0,-2]
//
//Explanation
//MinStack minStack = new MinStack();
//minStack.push(-2);
//minStack.push(0);
//minStack.push(-3);
//minStack.getMin(); // return -3
//minStack.pop();
//minStack.top();    // return 0
//minStack.getMin(); // return -2
// 
//
// 
// Constraints: 
//
// 
// -231 <= val <= 231 - 1 
// Methods pop, top and getMin operations will always be called on non-empty sta
//cks. 
// At most 3 * 104 calls will be made to push, pop, top, and getMin. 
// 
// Related Topics Stack Design 
// 👍 8262 👎 631

import java.util.Stack;
import java.util.logging.Logger;
public class _155_MinStack{
    private static final Logger logger = Logger.getLogger(_155_MinStack .class.toString());
    public static void main(String[] args) {
        long startTimeMillis = System.currentTimeMillis();
        //Solution solution = new _155_MinStack().new Solution();
        // assert solution == ;
        //logger.warning(String.valueOf(solution));
        logger.info("time cost: [" + (System.currentTimeMillis() - startTimeMillis) + "] ms");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class MinStack {
    private Stack<int[]> stack = new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        if(stack.isEmpty()) {
            stack.push(new int[]{val, val});
        } else {
            int currentMin = stack.peek()[1];
            stack.push(new int[]{val, Math.min(currentMin, val)});
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
       return stack.peek()[0];
    }
    
    public int getMin() {
        return stack.peek()[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
//leetcode submit region end(Prohibit modification and deletion)

}
