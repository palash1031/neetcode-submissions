class Solution {
    public int rob(int[] nums) {
        if (nums.length <= 2) return Arrays.stream(nums).max().getAsInt();
        int[] dp = new int[nums.length];

        dp[0] = nums[0];
        dp[1] = nums[1];
        dp[2] = dp[0] + nums[2];

        int currMax = dp[2] > dp[1] ? dp[2] : dp[1];

        for (int i = 3; i < nums.length; i++) {
            dp[i] = nums[i] + Math.max(dp[i-2], dp[i-3]);
            if (dp[i] > currMax) currMax = dp[i];
        }
        return currMax;
    }
}
