class Solution {

    int rows;
    int cols;
    char[][] board;

    public boolean exist(char[][] board, String word) {
        this.board = board;
        rows = board.length;
        cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(i, j, 0, word)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean dfs(int row, int col, int idx, String word) {
        if (idx == word.length()) {
            return true;
        }

        if (row < 0 || col < 0 || row >= rows || col >= cols ||
                board[row][col] != word.charAt(idx)) {
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '#';

        boolean found = dfs(row + 1, col, idx + 1, word) ||
                        dfs(row - 1, col, idx + 1, word) ||
                        dfs(row, col + 1, idx + 1, word) ||
                        dfs(row, col - 1, idx + 1, word);

        board[row][col] = temp;

        return found;
    }
}