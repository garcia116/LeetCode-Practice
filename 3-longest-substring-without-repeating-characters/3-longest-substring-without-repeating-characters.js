/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    let set = new Set()
    let l = 0;
    let r = 0;
    let max = 0;
    console.log(s.length)
    while(r < s.length){
        if(!set.has(s[r])){
            set.add(s[r++])
        }
        else{
            max = Math.max(max, set.size)
            set.delete(s[l++])
        }
    } 
    return Math.max(max, set.size)
};