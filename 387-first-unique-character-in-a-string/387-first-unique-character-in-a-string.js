/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function(s) {
    let obj = {}
    for(let i of s){
        (obj[i]) ? obj[i]+=1 : obj[i] = 1
    }
  //  console.log(obj)
    for(let i in obj){
        console.log(i)
        if(obj[i] === 1) return s.indexOf(i)
    }
    
    return -1
};