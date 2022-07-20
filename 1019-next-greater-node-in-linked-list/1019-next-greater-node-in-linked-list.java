/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        int[] result = new int[list.size()];
        Stack<Integer> stack = new Stack<>();
        
        for(int i = list.size()-1; i>=0; i--){
            while(!stack.isEmpty() && list.get(i) >= stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                result[i] = 0;
            }
            else{
                result[i] = stack.peek();
            }
            stack.push(list.get(i));
        }
        
        return result;
    }
}