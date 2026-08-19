class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        for(int i=0;i<n;i++) dp[i] = -1;
        return Math.min(minCostR(n-1,cost, dp),minCostR(n-2,cost, dp));}

    public int minCostR(int i,int[] cost, int[] dp){
        if(i==0 || i==1) return cost[i];
        if(dp[i] != -1)return dp[i];
        return dp[i] = cost[i] + Math.min(minCostR(i-1,cost,dp),minCostR(i-2,cost,dp));
    }}
