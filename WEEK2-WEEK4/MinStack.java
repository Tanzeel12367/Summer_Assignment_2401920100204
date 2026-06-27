import java.util.*;

class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> mn = new Stack<>();

    public void push(int val) {
        st.push(val);
        mn.push(mn.isEmpty() ? val : Math.min(val, mn.peek()));
    }
    public void pop() { st.pop(); mn.pop(); }
    public int top() { return st.peek(); }
    public int getMin() { return mn.peek(); }
}
