class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i < s.length(); i++){
            if(stack.isEmpty() || map.containsValue(s.charAt(i))){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.peek() != map.get(s.charAt(i))){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        
        return stack.isEmpty();
    }
}