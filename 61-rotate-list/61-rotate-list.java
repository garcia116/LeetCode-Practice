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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return head;
        }
        int length = 1;
        ListNode tail = head;
        while(tail.next != null){
            length++;
            tail = tail.next;
        }
        k %= length;
        if(k==0){
            return head;
        }
        tail.next = head;
        
        for(int i=0; i < length - k; i++){
            tail = tail.next;
        }
        head = tail.next;
        tail.next = null;
        
        return head;
    }
}