class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0];
        int[] dp1=new int[n+2];
        int[] dp2=new int[n+2];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        return Math.max(robLinear(nums,0,n-2,dp1), robLinear(nums,1,n-1,dp2));
    }
    public int robLinear(int[] nums, int s, int e,int[] dp){
        if(s>e) return 0;
        if (dp[s] != -1) return dp[s];
        int take = nums[s] + robLinear(nums,s+2,e,dp);
        int skip = robLinear(nums,s+1,e,dp);
        return dp[s] = Math.max(take,skip);
    }
}
