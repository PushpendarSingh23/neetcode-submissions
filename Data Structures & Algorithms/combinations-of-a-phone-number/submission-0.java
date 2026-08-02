class Solution {

    List<String> ans = new ArrayList<>();
    String[] map = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return ans;
        backtrack(digits, 0, new StringBuilder());
        return ans;}
    private void backtrack(String digits, int idx, StringBuilder curr) {
        if (idx == digits.length()) {
            ans.add(curr.toString());
            return;}
        for (char ch : map[digits.charAt(idx) - '0'].toCharArray()) {
            curr.append(ch);
            backtrack(digits, idx + 1, curr);
            curr.deleteCharAt(curr.length() - 1);
        }}}