class Solution {
    public String replaceDigits(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            if(i % 2 != 0){
                char c = s.charAt(i-1);
                int num = s.charAt(i) - '0';
                c = (char) (c + num);
                sb.append(c);
            }
            else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}