class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> hm = new HashMap<>();

        for (String s : strs) {
            int[] bucket = new int[26];

            for (int i = 0; i < s.length(); i++) {
                bucket[s.charAt(i) - 'a'] += 1;
            }

            String curr = Arrays.toString(bucket);
            if (hm.containsKey(curr)) {
                hm.get(curr).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                hm.put(curr, list);
            }
        }

        return new ArrayList<>(hm.values());
    }
}

/*
for each string s in strs, 
    make 26 int buckets 
    add each letter to each 

*/