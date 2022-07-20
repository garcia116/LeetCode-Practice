/**
 * @param {string} s
 * @return {string}
 */
var removeDuplicates = function(s) {
    let stack = []
    
    for(const c of s){
        if(stack.length && c == stack[stack.length - 1]){
            stack.pop()
        }
        else {
            stack.push(c)
        }
    }
    return stack.join("")
};