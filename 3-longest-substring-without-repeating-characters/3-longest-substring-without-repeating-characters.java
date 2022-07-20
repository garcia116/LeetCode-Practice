class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int l = 0;
        int r = 0;
        int max = 0;
        
        char[] chars = s.toCharArray();
        while(r < chars.length){
            if(!set.contains(chars[r])){
                set.add(chars[r]);
                r++;
            }
            else {
                max = Math.max(max, set.size());
                set.remove(chars[l]);
                l++;
            }
        }
        return Math.max(max, set.size());
    }
}