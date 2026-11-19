class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top = 0;
        int bottom = matrix.length-1;
        int mid = 0;

        while (top <= bottom) {
            mid = top + (bottom - top)/2;
            if (matrix[mid][0] == target) {
                return true;
            } else if (matrix[mid][0] > target) {
                bottom = mid-1;
            } else {
                top = mid+1;
            }
        }

        if (bottom < 0) return false;
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[bottom][i] == target) return true;
        }
        return false;
    }
}
