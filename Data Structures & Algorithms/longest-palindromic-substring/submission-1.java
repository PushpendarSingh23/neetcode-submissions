class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        Boolean[][] dp = new Boolean[n][n];
        String ans = "";
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s,i,j,dp)){
                    if (j - i + 1 > ans.length()) {
                    ans = s.substring(i, j + 1);}}}}
        return ans;     
    }
    public boolean isPalindrome(String s,int l, int r,Boolean[][] dp){
        if(l >= r) return true;
        if(dp[l][r] != null) return dp[l][r];
        if(s.charAt(l) != s.charAt(r)) return dp[l][r] = false;
        return dp[l][r] = isPalindrome(s,l+1,r-1,dp);
    }
}
