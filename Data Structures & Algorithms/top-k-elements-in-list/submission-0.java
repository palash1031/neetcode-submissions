class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int n : nums) {
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];

        for (int key : freqMap.keySet()) {
            int value = freqMap.get(key);
            if (buckets[value] == null) {
                buckets[value] = new ArrayList<>();
            }
            buckets[value].add(key);
        }

        int[] ans = new int[k];

        List<Integer> res = new ArrayList<>();
        for (int i = buckets.length-1; i >= 0 && res.size() < k; i--) {
            if (buckets[i] != null) {
                res.addAll(buckets[i]);
            }
        }

        for (int i = 0; i < k; i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}
