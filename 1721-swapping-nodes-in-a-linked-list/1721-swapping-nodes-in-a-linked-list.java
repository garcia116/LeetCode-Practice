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
    public ListNode swapNodes(ListNode head, int k) {
        k = k-1;
        ListNode firstNum = head;
        while(k > 0){
            firstNum = firstNum.next;
            k--;
        }
        ListNode secondNum = head;
        ListNode tail = firstNum;
        while(tail.next != null){
            secondNum = secondNum.next;
            tail = tail.next;
        }
        
        int temp = firstNum.val;
        firstNum.val = secondNum.val;
        secondNum.val = temp;
        
        return head;
    }
}