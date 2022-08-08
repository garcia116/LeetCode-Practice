class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        
        Arrays.sort(strs);
        String first = strs[0];
        String end = strs[strs.length-1];
        int c = 0;
        while(c < first.length()){
            if(first.charAt(c) == end.charAt(c)){
                c++;
            }
            else break;
        }
        return c == 0 ? "" : first.substring(0,c);
    }
}