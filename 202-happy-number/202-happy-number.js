/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function(n) {
    const set = new Set()
    
    var digit
    
    while(n !== 1){
        let sum = 0
        while(n > 0){
            sum += (n%10) * (n%10)
            n = Math.floor(n/10)
        }
        if(set.has(sum)){
            return false
        }
        else {
            set.add(sum)
            n = sum
        }
    }
    return true
};