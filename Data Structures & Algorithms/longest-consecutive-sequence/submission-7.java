class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int ans = 0;

        for (int n : nums) {
            hs.add(n);
        }

        for (int n : nums) {
            int counter = 1;
            int curr = n;
            while (hs.contains(curr + 1)) {
                counter++;
                curr++;
            }
            ans = Math.max(counter, ans);
        }
        return ans;
    }
}
