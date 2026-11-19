class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(nums[0],0);
        for (int i = 1; i < nums.length; i++) {
            if (hm.get(target-nums[i]) != null) return new int[] {hm.get(target-nums[i]), i};
            hm.put(nums[i],i);
        }
        return new int[] {0};
    }
}
