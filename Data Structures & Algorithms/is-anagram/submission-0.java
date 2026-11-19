class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> hmS = new HashMap<>();
        HashMap<Character, Integer> hmT = new HashMap<>();

        for (char c : s.toCharArray()) {
            hmS.put(c, hmS.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            hmT.put(c, hmT.getOrDefault(c, 0) + 1);
        }

        return hmS.equals(hmT);
    }
}

/**
we could maybe do 2 hashmaps and then do .equal()
*/
