class Solution {
    public int climbStairs(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return climbStairsM(n,dp);}
    public int climbStairsM(int n, int[] dp){
        if(n<=2) return n;
        if(dp[n-1] != -1) return dp[n];
        return dp[n]=climbStairsM(n-1,dp)+climbStairsM(n-2,dp);
    }

}