/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(s) {
    var set = new Set()
    i = 0, j = 0, max = 0
    while(j < s.length){
        if(!set.has(s[j])){
            set.add(s[j++])
            max = Math.max(max, set.size)
        } else {
            set.delete(s[i++])
        }
    }
    return max
};