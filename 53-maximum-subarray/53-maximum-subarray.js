/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
    var max = nums[0]
    var curr = max
    
    for(let i=1; i < nums.length; i++){
        curr = Math.max(curr + nums[i], nums[i])
        max = Math.max(max, curr)
    }
    return max
    
};