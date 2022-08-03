class Solution {
    public int firstUniqChar(String s) {
        char[] alphabet = new char[26];
        for(char ch : s.toCharArray()){
            alphabet[ch-'a']++;
        }
        for(char ch: s.toCharArray()){
            if(alphabet[ch-'a'] == 1){
                return s.indexOf(ch);
            }
        }
        
        return -1;
    }
}