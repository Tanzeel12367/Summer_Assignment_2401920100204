class RansomNote {
    public boolean canConstruct(String rn, String mag) {
        int[] cnt = new int[26];
        for(char c : mag.toCharArray()) cnt[c-'a']++;
        for(char c : rn.toCharArray()){
            if(--cnt[c-'a']<0) return false;
        }
        return true;
    }
}
