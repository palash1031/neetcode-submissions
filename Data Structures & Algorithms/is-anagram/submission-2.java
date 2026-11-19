class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> hmS = new HashMap<>();

        for (char c : s.toCharArray()) {
            hmS.put(c, hmS.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            if (!hmS.containsKey(c)) return false;
            hmS.put(c, hmS.get(c) - 1);
            if (hmS.get(c) == 0) hmS.remove(c);
        }
        return hmS.size()==0;
    }
}

/**
we could maybe do 2 hashmaps and then do .equal()
*/
