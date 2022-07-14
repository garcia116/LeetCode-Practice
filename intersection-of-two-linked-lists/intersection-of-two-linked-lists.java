/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> pB = new HashSet<>();
        while(headB != null){
            pB.add(headB);
            headB = headB.next;
        }
        while(headA != null){
            if(pB.contains(headA)){
                return headA;
            }
            headA = headA.next;
        }
        return null;
    }
}