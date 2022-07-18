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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0, head);
        ListNode newList = temp;
        
        while(newList.next != null){
            if(newList.next.val == val){
                newList.next = newList.next.next;
            }
            else{
               newList = newList.next; 
            }
            
        }
        return temp.next;
    }
    void Print(ListNode head) {
    ListNode cur = head;
    while(cur!=null){
        System.out.println(cur.val);
        cur = cur.next;
    }
  
}
}