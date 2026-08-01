class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(nums,target,0,new ArrayList<>(), ans);
        return ans;}
    
    public void solve(int[] nums, int target, int index,List<Integer> curr, List<List<Integer>> ans){
        if(target == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }
        if(target < 0) return;
        for(int i=index;i<nums.length;i++){
            curr.add(nums[i]);
            solve(nums,target-nums[i],i,curr,ans);
            curr.remove(curr.size()-1);

        }
        
    }}
