class Solution {
    public List<List<String>> solveNQueens(int n) {
    char[][] board = new char[n][n];
    for (int i = 0; i < n; i++) {
        Arrays.fill(board[i], '.');}
    List<List<String>> result = new ArrayList<>();
    solve(board, 0, result);
    return result;
}
public void solve(char[][] board, int row, List<List<String>> result) {

    if (row == board.length) {

        List<String> temp = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            temp.add(new String(board[i]));
        }

        result.add(temp);
        return;
    }

    for (int col = 0; col < board.length; col++) {

        if (isSafe(board, row, col)) {

            board[row][col] = 'Q';

            solve(board, row + 1, result);

            board[row][col] = '.';
        }
    }}
    public static boolean isSafe(char[][] board, int row, int col) {
        // Upper-left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;}}
        // Vertical upward
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;}}
        // Upper-right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;}}
        return true;}
}