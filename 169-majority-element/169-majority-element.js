/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
    let map = {}
    for(let i=0; i < nums.length; i++){
        map[nums[i]] = (map[nums[i]] || 0) + 1
      //  console.log(map[nums[i]])
        if(map[nums[i]] > nums.length/2) return nums[i]
    }
};