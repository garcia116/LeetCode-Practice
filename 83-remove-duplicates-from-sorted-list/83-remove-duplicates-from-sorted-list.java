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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        
        while(current != null){
            if(current.next == null){
                break;
            }
            if(current.val == current.next.val){
                current.next = current.next.next;
            } else{
                current = current.next;
            }
        }
        return head;
    }
}