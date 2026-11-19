class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        Set<Integer> hs = new HashSet<>();
        for (int num : nums) {
            hs.add(num);
        }

        for (int x : nums) {
            if (!hs.contains(x-1)) {
                int i = x;
                while (hs.contains(i)) {
                    i++;
                }
                ans = Math.max(ans, i - x);
            }
        }
        return ans;
    }
}
