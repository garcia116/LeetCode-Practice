class Solution {
    public int balancedStringSplit(String s) {
        int r = 0;
        int l = 0;
        int max = 0;
        for(char c : s.toCharArray()){
            if(c == 'R'){
                r++;
            }
            else{
                l++;
            }
            if(r == l){
                max++;
            }
        }
        return max;
    }
}