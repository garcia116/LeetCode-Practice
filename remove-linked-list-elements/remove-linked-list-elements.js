/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} val
 * @return {ListNode}
 */
var removeElements = function(head, val) {
    let temp = new ListNode(0, head)
    let current = temp
    
    while(current.next != null){
        if(current.next.val == val){
            current.next = current.next.next
        }
        else {
            current = current.next
        }
    }
    return temp.next
};