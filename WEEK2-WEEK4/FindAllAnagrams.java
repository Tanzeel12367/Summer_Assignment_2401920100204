import java.util.*;

class FindAllAnagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(s.length()<p.length()) return res;
        int[] pc=new int[26], sc=new int[26];
        for(int i=0;i<p.length();i++){
            pc[p.charAt(i)-'a']++;
            sc[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(pc,sc)) res.add(0);
        for(int i=p.length();i<s.length();i++){
            sc[s.charAt(i)-'a']++;
            sc[s.charAt(i-p.length())-'a']--;
            if(Arrays.equals(pc,sc)) res.add(i-p.length()+1);
        }
        return res;
    }
}
