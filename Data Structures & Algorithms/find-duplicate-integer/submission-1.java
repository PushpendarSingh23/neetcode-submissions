class Solution {
     public int findDuplicate(int[] nums) {
        int slow = nums[0];                     // slow = 1
        int fast = nums[0];                     // fast = 1
        do {
            slow = nums[slow];                  // 1 -> 3 -> 2 -> 4
            fast = nums[nums[fast]];            // 1 -> 2 -> 2 -> 2
        } while(slow != fast);                  // meet at 2
        slow = nums[0];                         // reset to 1
        while(slow != fast) {
            slow = nums[slow];                  // 1 -> 3 -> 2
            fast = nums[fast];                  // 2 -> 4 -> 2
        }
        return slow;   
    }
}
