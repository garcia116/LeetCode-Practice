/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let seen = {}
    
    for (let i = 0; i < nums.length; i++) {
        seen[nums[i]] = (seen[nums[i]] || 0) + 1
        if (seen[nums[i]] >= nums.length / 2) return nums[i]
    }
};