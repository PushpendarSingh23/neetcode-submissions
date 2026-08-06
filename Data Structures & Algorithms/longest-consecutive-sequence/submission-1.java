class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for(int num : nums){ 
            set.add(num);}
        for(int num : nums){
            if(!set.contains(num-1)){ // start hi vaha se krenge jiska
                int len = 0;          //   chota element na ho 
                while(set.contains(num)){
                len++;
                num++;}
                ans = Math.max(ans,len);}
        }
        return ans;
    }
}
