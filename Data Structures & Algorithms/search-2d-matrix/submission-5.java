class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int upPointer = 0;
        int downPointer = matrix.length - 1;

        while (upPointer <= downPointer) {
            int mid = upPointer + (downPointer - upPointer)/2;
            if (matrix[mid][0] == target) {
                return true;
            } else if (matrix[mid][0] > target) {
                downPointer = mid-1;
            } else {
                upPointer = mid+1;
            }
        }
        
        if (downPointer < 0) return false;
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[downPointer][i] == target) return true;
        }
        return false;
    }
}
