class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> result = new HashSet<>();
        int max = 0, i = 0, j = 0;
        while(i < s.length()){
            if(!result.contains(s.charAt(i))){
                result.add(s.charAt(i));
                max = Math.max(max, result.size());
                i++;
            }
            else{
                result.remove(s.charAt(j++));
            }
        }
        return max;
    }
}