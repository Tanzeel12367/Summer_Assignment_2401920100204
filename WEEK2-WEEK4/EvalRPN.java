import java.util.*;

class EvalRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for(String t : tokens){
            if("+-*/".contains(t)){
                int b=st.pop(), a=st.pop();
                if(t.equals("+")) st.push(a+b);
                else if(t.equals("-")) st.push(a-b);
                else if(t.equals("*")) st.push(a*b);
                else st.push(a/b);
            } else st.push(Integer.parseInt(t));
        }
        return st.pop();
    }
}
