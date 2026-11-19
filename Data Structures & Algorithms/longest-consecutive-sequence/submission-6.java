class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>(nums.length * 2);

        for (int x : nums) set.add(x);
        int best = 0;

        for (int x : set) {
            if (!set.contains(x-1)) {
                int length = 1;
                int curr = x;

                while (set.contains(curr+1)) {
                    curr++;
                    length++;
                }
                best = Math.max(length, best);
            }
        }
        return best;
    }
}

/**k
trivially we can sort and then just iterate and up a count if 
the num != its previous

**/
