class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1; 
        int r = Arrays.stream(piles).max().getAsInt();
        int ans = r; 

        while (l <= r) {
            int mid = l + (r-l)/2;

            long time = 0;
            for (int x : piles) {
                time += Math.ceil((double) x / mid);
            }
            if (time <= h) {
                ans = mid;
                r = mid-1;
            } else {
                l = mid+1;
            }
        }
        return ans;
    }
}
