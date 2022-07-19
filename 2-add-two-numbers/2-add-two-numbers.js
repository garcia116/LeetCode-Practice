/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
var addTwoNumbers = function(l1, l2) {
    let dummy = new ListNode(0);
    let current = dummy, carry = 0
    
    while(l1 || l2 || carry){
        let x = l1 ? l1.val : null;
        let y = l2 ? l2.val : null;
        let sum = x + y + carry
        carry = sum > 9 ? 1 : 0
        current.next = new ListNode(sum % 10)
        current = current.next
        l1 = l1 ? l1.next : null
        l2 = l2 ? l2.next : null
    }
    
    return dummy.next;
};