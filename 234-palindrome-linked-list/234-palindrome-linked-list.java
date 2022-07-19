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
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        ListNode firstHalf = slow;
        ListNode secondHalf = reverseList(firstHalf.next);
 
        ListNode p1 = head;
        ListNode p2 = secondHalf;
        
        while(p2 != null){
            if(p1.val != p2.val){
                return false;
            }
            else{
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        
        return true;
    }
    
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    
    void Print(ListNode head) {
    ListNode cur = head;
    while(cur!=null){
        System.out.println(cur.val);
        cur = cur.next;
    }
  
}
}