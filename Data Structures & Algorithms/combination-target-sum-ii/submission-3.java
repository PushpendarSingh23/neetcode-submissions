class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        solve(nums ,target, 0 , new ArrayList<>() , ans);
        return ans;
        }
        void solve(int[] nums, int target, int index, List<Integer> curr, List<List<Integer>> ans){
            if(target == 0){ 
                ans.add(new ArrayList<>(curr));
                return;}
            if(target < 0) return;
            for(int i = index;i<nums.length;i++){
                if(nums[i] > target) break;
                if(i > index && nums[i] == nums[i-1]) continue;
                curr.add(nums[i]);
                solve(nums ,target - nums[i], i+1 , curr, ans);
                curr.remove(curr.size() - 1);
            }}}
