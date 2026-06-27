import java.util.*;

class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<String> strs = new Stack<>();
        String cur = "";
        int k=0;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                k = k*10 + (c-'0');
            } else if(c=='['){
                nums.push(k); k=0;
                strs.push(cur); cur="";
            } else if(c==']'){
                int n = nums.pop();
                String tmp = strs.pop();
                for(int i=0;i<n;i++) tmp+=cur;
                cur=tmp;
            } else {
                cur+=c;
            }
        }
        return cur;
    }
}
