/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */
var strStr = function(haystack, needle) {
    for(let i=0; i < haystack.length; i++){
        if(haystack[i] == needle[0]){
        
            if(haystack.length - needle.length < i){
                return -1
            }
            else if(haystack.substring(i, needle.length+i) == needle){
                return i;
            }
        }      
    }
    return -1;
};