class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> requiredNum = new HashMap<>();
        
        for(int i=0; i < nums.length; i++){
            if(requiredNum.containsKey(target-nums[i])){
            int[] sums = {requiredNum.get(target-nums[i]), i};
            return sums;
            } else{
                requiredNum.put(nums[i], i);
            }
        }
        return null;
    }
}