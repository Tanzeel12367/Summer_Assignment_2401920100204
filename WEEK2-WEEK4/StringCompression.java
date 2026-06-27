class StringCompression {
    public int compress(char[] ch) {
        int i=0, j=0;
        while(i<ch.length){
            char cur = ch[i];
            int cnt=0;
            while(i<ch.length && ch[i]==cur){ i++; cnt++; }
            ch[j++]=cur;
            if(cnt>1){
                for(char c : String.valueOf(cnt).toCharArray())
                    ch[j++]=c;
            }
        }
        return j;
    }
}
