class Solution {
    public String countAndSay(int n) {
        if(n == 1) return "1";
        
        StringBuilder res = new StringBuilder();
        
        String s = countAndSay(n-1);
        
        for(int i=0, c=1; i<s.length(); i++, c++){
            if(i==s.length()-1 || s.charAt(i) != s.charAt(i+1)){
                res.append(c).append(s.charAt(i));
                c = 0;
            }
        }
        return res.toString();
    }
}