class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;                                  // total rows
        int n = grid[0].length;                               // total cols
        int count = 0;                                        // island counter
        boolean[][] vis = new boolean[m][n];                  // visited matrix
        for(int i = 0; i < m; i++){                           // row loop
            for(int j = 0; j < n; j++){                       // col loop
                if(grid[i][j] == '1' && !vis[i][j]){     // land mila aur visit nahi hua
                    dfs(i, j, grid);                     // poora island traverse karo
                    count++;}}}
        return count;}
    private void dfs(int row, int col, char[][] grid){
        int m = grid.length;                               // rows
        int n = grid[0].length;                            // cols
        if(row < 0 || col < 0 || row >= m || col >= n) return;    // boundary check
        if(grid[row][col] == '0')   return;                // water ya already visited
        grid[row][col] = '0';                              // mark visited (sink island)
        dfs(row + 1, col, grid);                           // down
        dfs(row - 1, col, grid);                           // up
        dfs(row, col + 1, grid);                           // right
        dfs(row, col - 1, grid);}}                         // left
