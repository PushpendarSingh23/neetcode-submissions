class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[] dp = new boolean[n];
        int start = 0, maxLen = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= i; j--) {
                if (s.charAt(i) == s.charAt(j) &&
                    (j - i <= 2 || dp[j - 1])) {
                    dp[j] = true;
                    if (j - i + 1 > maxLen) {
                        start = i;
                        maxLen = j - i + 1;}}
                else { dp[j] = false;}}}
        return s.substring(start, start + maxLen);
    }}
    