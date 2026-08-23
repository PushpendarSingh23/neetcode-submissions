class Solution {
    int[][] dp;
    public int change(int amount, int[] coins) {
        dp = new int[coins.length][amount + 1];
        for(int i=0;i<coins.length;i++) Arrays.fill(dp[i],-1);
        return solve(0,amount,coins);
        }
    public int solve(int index, int amount, int[] coins){
        if(amount == 0) return 1;
        if(index == coins.length) return 0;
        if(dp[index][amount] != -1) return dp[index][amount];
        int skip = solve(index + 1,amount,coins);
        int take = 0;
    if(coins[index]  <= amount) take = solve(index,amount - coins[index],coins);
    dp[index][amount] = take + skip;
    return dp[index][amount];}
}
