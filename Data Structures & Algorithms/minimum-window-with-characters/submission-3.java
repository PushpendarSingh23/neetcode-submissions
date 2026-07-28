class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) return "";
        int[] cnt = new int[128];
        for (char c : t.toCharArray()) cnt[c]++;
        int left = 0, start = 0, min = Integer.MAX_VALUE, need = t.length();
        for (int right = 0; right < s.length(); right++) {
            if (cnt[s.charAt(right)]-- > 0) need--;
            while (need == 0) {
                if (right - left + 1 < min) {
                    min = right - left + 1;
                    start = left;}
                char ch = s.charAt(left);
                cnt[ch]++;
                if (cnt[ch] > 0) { need++;}
                left++;}}
        return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);
    }}


    