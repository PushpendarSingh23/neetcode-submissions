class Solution {
   public int climbStairs(int n){
    if(n<=2) return n;
    int[] dp=new int[n+1];
    dp[0]=0; // 0 steps -> 0 ways
    dp[1]=1; // 1 step -> 1 way
    dp[2]=2; // 2 steps -> 2 ways
    for(int i=3;i<=n;i++)
        dp[i]=dp[i-1]+dp[i-2]; // previous 2 states
    return dp[n];}
}