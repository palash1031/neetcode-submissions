class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int ans = 1;

        HashSet<Integer> hs = new HashSet<>();
        for (int n : nums) hs.add(n);

        for (int n : hs) {
            if (!hs.contains(n - 1)) {
                int currStreak = 1;
                int currNum = n;
                while (hs.contains(currNum+1)) {
                    currStreak++;
                    currNum++;
                }
                ans = Math.max(currStreak, ans);
            }
        }
        return ans;
    }
}
