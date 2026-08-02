class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums, 0, new ArrayList<Integer>(), ans);
        return ans;
    }
    static void solve(int[] nums, int idx,
                  List<Integer> curr, List<List<Integer>> ans) {
    ans.add(new ArrayList<>(curr));                 
    for(int i = idx; i < nums.length; i++) {
        if(i > idx && nums[i] == nums[i - 1]) continue; 
        curr.add(nums[i]);                          
        solve(nums, i + 1, curr, ans);             
        curr.remove(curr.size() - 1);              
    }
}
}
