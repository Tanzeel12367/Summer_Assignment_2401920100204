class ReverseWordsIII {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String w : words){
            sb.append(new StringBuilder(w).reverse());
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
