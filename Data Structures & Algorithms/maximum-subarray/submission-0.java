class Solution {
    public int maxSubArray(int[] nums) {
        int currMax = nums[0];
        int running = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (running < 0) running = 0;
            running += nums[i];
            currMax = Math.max(running, currMax);
        }
        return currMax;
    }
}
