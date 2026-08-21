class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int result = nums[0];
        for(int i=1; i<nums.length; i++){
            int current = nums[i];
            int oldMax = max;
max = Math.max(current, Math.max(oldMax * current, min * current));
min = Math.min(current, Math.min(oldMax * current, min * current));

result = Math.max(result, max);}
        return result;
    }}
