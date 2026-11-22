class Solution {
    public int numIslands(char[][] grid) {
        int ans = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != '0') ans += dfs(grid, i, j, 0);
            }
        }
        return ans; 
    }

    private int dfs(char[][] grid, int i, int j, int count) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) return 0;
        if (grid[i][j] == '0') return 0;
        grid[i][j] = '0';

        count += (dfs(grid, i - 1, j, count) + dfs(grid, i + 1, j, count) + dfs(grid, i, j - 1, count) + dfs(grid, i, j + 1, count));
        return 1;
    }

}
