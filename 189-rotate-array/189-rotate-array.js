/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function(nums, k) {
    function reverse(arr, start, end){
        while(start < end){
            [arr[start], arr[end]] = [arr[end], arr[start]]
          //  console.log(arr)
            start +=1
            end -=1
        }
    }
    
    k %= nums.length
    
    reverse(nums, 0, nums.length-1)
    reverse(nums, 0, k-1)
    reverse(nums, k, nums.length-1)
};