class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        for(int i=0;i<n;i++) dp[i] = -1;
        return robber(n-1,nums,dp);
    }
    public int robber(int i,int[] nums,int[] dp){
        if(i==0) return nums[0];
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int take = nums[i] + robber(i-2,nums,dp);
        int skip = robber(i-1,nums,dp);
        return dp[i] = Math.max(take,skip);
    }
}
