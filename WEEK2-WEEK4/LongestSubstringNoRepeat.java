import java.util.*;

class LongestSubstringNoRepeat {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> mp = new HashMap<>();
        int max=0, l=0;
        for(int r=0;r<s.length();r++){
            char c = s.charAt(r);
            if(mp.containsKey(c)) l = Math.max(l, mp.get(c)+1);
            mp.put(c,r);
            max = Math.max(max, r-l+1);
        }
        return max;
    }
}
