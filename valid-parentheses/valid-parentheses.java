class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(!stack.empty() && map.containsKey(c)){
                
                if(map.get(c) != stack.pop()){
                    return false;
                }
            }
            else{
                stack.push(c);
            }
        }
        
        return stack.empty();
    }
}