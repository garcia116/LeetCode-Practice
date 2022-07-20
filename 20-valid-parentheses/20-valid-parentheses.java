class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
        brackets.put(']', '[');
        
        for(char c : s.toCharArray()){
            if(brackets.containsKey(c)){
                if(stack.isEmpty() || stack.pop() != brackets.get(c)){
                    return false;
                }
            }
            else if(brackets.containsValue(c)){
                stack.push(c);
            }
        }
        
        return stack.isEmpty();
    }
}