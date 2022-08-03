class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.toLowerCase();
        int start =0;
        int end= s.length()-1;
        
        while(start<end){
            if(!Character.isLetterOrDigit(s1.charAt(start))){
                start++;
                continue;
            }
            if(!Character.isLetterOrDigit(s1.charAt(end))){
                end--;
                continue;
            }
            if(s1.charAt(start) != s1.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}