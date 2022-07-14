/**
 * @param {string} s
 * @return {number}
 */
var firstUniqChar = function(s) {
    let map = new Map()
    for(let i of s){
        (map.has(i)) ? map.set(i, map.get(i) + 1) : map.set(i, 1)    
    }
  //  console.log(map)
    for(let i of map.keys()){
        console.log(map.get(i))
        if(map.get(i) === 1) return s.indexOf(i)
    }
    
    return -1
};