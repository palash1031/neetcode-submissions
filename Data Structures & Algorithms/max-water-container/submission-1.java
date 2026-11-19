class Solution {
    public int maxArea(int[] heights) {
        int i = 0;
        int j = heights.length-1; 
        int maxArea = -1;

        while (i < j) {
            int iHeight = heights[i];
            int jHeight = heights[j];
            int currArea = (Math.min(iHeight,jHeight)*(j-i));
            maxArea = Math.max(currArea, maxArea);
            
            if (heights[i] <= heights[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }
}
