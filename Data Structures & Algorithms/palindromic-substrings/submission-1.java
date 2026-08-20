class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int dp[] = new int[n];
        return count(s,0,dp);}
    private int count(String s,int start,int[] dp){
        if(start == s.length()) return 0;
        if (dp[start] != 0) { return dp[start];}
        int count = 0;
        count += expand(s,start,start);   // odd length
        count += expand(s,start,start + 1);  // even length
        return dp[start] = count + count(s, start+1,dp);
    }
    private int expand(String s, int left, int right){
        if(left < 0 || right >= s.length() ||
        s.charAt(left) != s.charAt(right)){ return 0;}
        return 1 + expand(s, left -1, right + 1);
    }
}
    
