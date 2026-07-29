class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] arr = new int[nums.length - k + 1];
        int left = 0;
        int right = left + k;
        while (left <= nums.length - k){
        right = left + k;
        int max = Integer.MIN_VALUE;
        for(int i=left; i<right;i++){
            max  = Math.max(max, nums[i]);
        }
        arr[left] = max;
        left++;}
    return arr;
}}
