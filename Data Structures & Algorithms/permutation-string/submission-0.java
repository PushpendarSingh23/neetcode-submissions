class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] cnt = new int[26];
        for (char c : s1.toCharArray()) cnt[c - 'a']++;
        for (int i = 0; i < s1.length(); i++) cnt[s2.charAt(i) - 'a']--;
        if (same(cnt)) return true;
        for (int i = s1.length(); i < s2.length(); i++) {
            cnt[s2.charAt(i) - 'a']--;
            cnt[s2.charAt(i - s1.length()) - 'a']++;
            if (same(cnt)) return true;}
        return false;
    }
    private boolean same(int[] cnt) {
        for (int x : cnt)
            if (x != 0) return false;
        return true;
    }
}