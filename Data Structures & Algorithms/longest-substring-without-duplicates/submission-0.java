class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();

        int l = 0;
        int r = 0;
        int ans = 0;

        while (r < s.length()) {
            if (hs.contains(s.charAt(r))) {
                while (hs.contains(s.charAt(r))) {
                    hs.remove(s.charAt(l));
                    l++;
                }
            } else {
                hs.add(s.charAt(r));
                r++;
            }
            ans = Math.max(ans, hs.size());
        }
        return ans;
    }
}
