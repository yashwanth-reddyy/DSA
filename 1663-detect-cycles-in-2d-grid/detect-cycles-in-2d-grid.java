class Solution {
    boolean b[][];

    public boolean containsCycle(char[][] grid) {
        b = new boolean[grid.length][grid[0].length];

        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(!b[i][j]) {
                    if(dfs(grid, grid[i][j], i, j, -1, -1)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean dfs(char[][] grid, char a, int i, int j, int k, int h) {
        if(i < 0 || i >= grid.length ||
           j < 0 || j >= grid[0].length ||
           grid[i][j] != a) {
            return false;
        }

        if(b[i][j]) {
            return true;
        }

        b[i][j] = true;

        if(!(i + 1 == k && j == h) &&
           dfs(grid, a, i + 1, j, i, j)) {
            return true;
        }

        if(!(i - 1 == k && j == h) &&
           dfs(grid, a, i - 1, j, i, j)) {
            return true;
        }

        if(!(i == k && j + 1 == h) &&
           dfs(grid, a, i, j + 1, i, j)) {
            return true;
        }

        if(!(i == k && j - 1 == h) &&
           dfs(grid, a, i, j - 1, i, j)) {
            return true;
        }

        return false;
    }
}