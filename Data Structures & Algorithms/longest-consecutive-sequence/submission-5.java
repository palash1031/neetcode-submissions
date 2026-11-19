class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return nums.length;
        Arrays.sort(nums);
        int count = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                count++;
            } else {
                if (nums[i] == nums[i-1] + 1) {
                    count++;
                } else if (nums[i] == nums[i-1]) {
                    //do nothing
                } else {
                    count = 1;
                }
            }
            ans = Math.max(count, ans);
        }
        return ans;
    }
}

/**k
trivially we can sort and then just iterate and up a count if 
the num != its previous

**/
