class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        HashMap<Character, Integer> hms = new HashMap<>();
        HashMap<Character, Integer> hmt = new HashMap<>();

        for (char c : s.toCharArray()) {
            hms.put(c, hms.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            hmt.put(c, hmt.getOrDefault(c, 0) + 1);
        }
        return hms.equals(hmt);
    }
}
