class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        Boolean[][] dp = new Boolean[n][n];
        int start = 0, maxLen = 1;
        for(int i=0;i<n;i++) dp[i][i] = true;
        for(int len = 2;len<=n;len++){
            for(int i=0;i<= n - len;i++){
                int j = i+len-1;
                if(len == 2) dp[i][j] = s.charAt(i) == s.charAt(j);
                else dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i+1][j-1];
                if(dp[i][j] && len>maxLen){
                    start = i;
                    maxLen = len;}}}
        return s.substring(start, start + maxLen);
}}
