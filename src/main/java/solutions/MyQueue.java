package solutions;
import java.util.Stack;

public class MyQueue {
    public Stack<Integer> stack1;
    public Stack<Integer> stack2;
    public int size;
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
        size = 0;
    }

    public void push(int x) {
        stack1.push(x);
        size++;
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        int value = stack2.pop();
        size--;
        return value;
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        return size == 0 ? true : false;
    }
}