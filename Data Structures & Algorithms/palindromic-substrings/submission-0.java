class Solution {
    public int countSubstrings(String s) {
        return count(s,0);}
    private int count(String s,int start){
        if(start == s.length()) return 0;
        int count = 0;
        count += checkPalindrome(s,start,start);   // odd length
        count += checkPalindrome(s,start,start + 1);  // even length
        return count + count(s, start+1);
    }
    private int checkPalindrome(String s, int left, int right){
        if(left < 0 || right >= s.length() ||
        s.charAt(left) != s.charAt(right)){
            return 0;}
        return 1 + checkPalindrome(s, left -1, right + 1);
    }
}
    
