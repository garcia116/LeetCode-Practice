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
    public boolean isPalindrome(ListNode head) {
        ListNode firstHalfEnd = findHalf(head);
        ListNode secondHalfStart = reverseList(firstHalfEnd.next);
        
        ListNode p1 = head;
        ListNode p2 = secondHalfStart;
        
        while(p2 != null){
            if(p2.val != p1.val){
                return false;
            }
            p2 = p2.next;
            p1 = p1.next;
        }
        return true;
        
    }
    
    public ListNode findHalf(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

}