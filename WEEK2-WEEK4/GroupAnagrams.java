import java.util.*;

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            mp.computeIfAbsent(key, x->new ArrayList<>()).add(s);
        }
        return new ArrayList<>(mp.values());
    }
}
