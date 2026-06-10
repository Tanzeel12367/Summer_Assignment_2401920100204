class RansomNote {
    public boolean canConstruct(String r, String m) {
        int[] cnt=new int[26];
        for(char c:m.toCharArray()) cnt[c-'a']++;
        for(char c:r.toCharArray()){
            if(--cnt[c-'a']<0) return false;
        }
        return true;
    }
}
