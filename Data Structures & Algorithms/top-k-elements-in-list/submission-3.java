class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        List<Integer>[] countList = new List[nums.length+1];

        for (int x : nums) {
            countMap.put(x, countMap.getOrDefault(x, 0) + 1);
        }

        for (int x : countMap.keySet()) {
            int freq = countMap.get(x);

            if (countList[freq] == null) {
                countList[freq] = new ArrayList<>();
            }
            countList[freq].add(x);
        }

        int[] ans = new int[k];
        int idx = 0;

        for (int i = countList.length - 1; i >= 0; i--) {
            if (countList[i] != null) {
                for (int num : countList[i]) {
                    ans[idx] = num;
                    idx++;

                    if (idx == k) {
                        return ans;
                    }
                }
            }
        }

        return ans;
    }
}
