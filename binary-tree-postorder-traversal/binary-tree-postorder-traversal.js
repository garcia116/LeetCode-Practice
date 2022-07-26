/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var postorderTraversal = function(root) {
    let list = []
    
    function traversePostorder(root){
        if(root){
            traversePostorder(root.left)
            traversePostorder(root.right)
            list.push(root.val)
        }
    }
    traversePostorder(root)
    
    return list
};