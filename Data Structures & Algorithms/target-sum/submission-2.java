class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;

        // Maximum possible absolute sum
        int total = 0;
        for (int num : nums) {
            total += num;
        }

        // If target is outside possible range
        if (target > total || target < -total) {
            return 0;
        }

        // Offset is used because sum can be negative
        int offset = total;

        // memo[index][sum + offset]
        int[][] memo = new int[n][2 * total + 1];

        // -1 means not calculated yet
        for (int i = 0; i < n; i++) {
            java.util.Arrays.fill(memo[i], -1);
        }

        return solve(nums, 0, 0, target, memo, offset);
    }

    private int solve(int[] nums, int index, int sum,
                      int target, int[][] memo, int offset) {

        // Base case
        if (index == nums.length) {
            return sum == target ? 1 : 0;
        }

        // Already calculated
        if (memo[index][sum + offset] != -1) {
            return memo[index][sum + offset];
        }

        // Choose +
        int add = solve(
            nums,
            index + 1,
            sum + nums[index],
            target,
            memo,
            offset
        );

        // Choose -
        int subtract = solve(
            nums,
            index + 1,
            sum - nums[index],
            target,
            memo,
            offset
        );

        // Store result
        memo[index][sum + offset] = add + subtract;

        return memo[index][sum + offset];
    }
}