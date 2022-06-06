import java.util.Stack;

public class _716_MaxStack {
  class MaxStack {

    private Stack<int []> stack = new Stack<>();

    public MaxStack() {

    }

    public void push(int x) {
      if(stack.isEmpty()) {
        stack.push(new int[]{x, x});
      } else {
        int currentMax = stack.peek()[1];
        stack.push(new int[]{x, Math.max(currentMax, x)});
      }
    }

    public int pop() {
      return stack.pop()[0];
    }

    public int top() {
      return stack.peek()[0];
    }

    public int peekMax() {
      return stack.peek()[1];
    }

    public int popMax() {
      int max = peekMax();
      Stack<Integer> buffer = new Stack<>();
      while (top() != max) {
        buffer.push(pop());
      }
      pop();
      while (!buffer.isEmpty()) {
        push(buffer.pop());
      }
      return max;
    }
  }
}
