class Solution {
    public void islandsAndTreasure(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(grid[i][j] == 0){
                    q.add(new int[]{i,j});}}}
        int[][] directions = {{1, 0},{-1, 0},{0, 1},{0, -1}};   
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int r = curr[0];
            int c = curr[1];
            for(int[] dir : directions){
                int nr = r + dir[0];
                int nc = c + dir[1];
                if(nr < 0 || nr >= rows ||
                   nc < 0 || nc >= cols){
                    continue;}
                if(grid[nr][nc] != Integer.MAX_VALUE){
                    continue;}
                grid[nr][nc] = grid[r][c] + 1;
                q.add(new int[]{nr, nc});}}}}