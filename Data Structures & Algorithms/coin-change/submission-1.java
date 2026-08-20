class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp,-1);
        int ans = solve(coins, amount,dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
        }
    public int solve(int[] coins, int amount, int[] dp){
        int n = coins.length;
        if(amount == 0) return 0;
        if(amount < 0) return Integer.MAX_VALUE;
        if (dp[amount] != -1) return dp[amount];
        int ans = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            int result = solve(coins, amount - coins[i], dp);
            if (result != Integer.MAX_VALUE) {
                ans = Math.min(ans, 1 + result);}
        dp[amount] = ans;
        }
        return dp[amount];  
    }}
