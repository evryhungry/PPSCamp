import java.util.LinkedList;
// https://leetcode.com/problems/min-stack/
class MinStack {
    private LinkedList<Integer> stack;
    private LinkedList<Integer> minStack;

    public MinStack() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    public void push(int val) {
        stack.addLast(val);
        if (minStack.isEmpty() || val <= minStack.getLast()) {
            minStack.addLast(val);
        }
    }

    public void pop() {
        if (stack.removeLast().equals(minStack.getLast())) {
            minStack.removeLast();
        }
    }

    public int top() {
        return stack.getLast();
    }

    public int getMin() {
        return minStack.getLast();
    }
}
