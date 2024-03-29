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
var preorderTraversal = function(root) {
    let list = []
    
    function traversePreorder(root){
        if(root){
            list.push(root.val)
            traversePreorder(root.left)
            traversePreorder(root.right)
        }
    }
    
    traversePreorder(root)
    
    return list
};