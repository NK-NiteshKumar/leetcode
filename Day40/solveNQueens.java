class Solution {

    public List<List<String>> solveNQueens(int n) {
        
        char[][] board = new char[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                board[i][j] = '.';
            }
        }

        List<List<String>> res = new ArrayList<>();

        int[] usedRows = new int[n];
        int[] usedLowerDiagonal = new int[2 * n - 1];
        int[] usedUpperDiagonal = new int[2 * n - 1];

        solve(0, board, res, usedRows, usedLowerDiagonal, usedUpperDiagonal);

        return res;
    }

    public void solve(int col, char[][] board, List<List<String>> res, int[] usedRows, int[] usedLowerDiagonal, int[] usedUpperDiagonal){

        if(col == board.length){
            res.add(construct(board));
            return;
        }

        for(int row = 0; row < board.length; row++){

            if(usedRows[row] == 0 && usedLowerDiagonal[row + col] == 0 && usedUpperDiagonal[board.length - 1 + col - row] == 0){

                board[row][col] = 'Q';

                usedRows[row] = 1;
                usedLowerDiagonal[row + col] = 1;
                usedUpperDiagonal[board.length - 1 + col - row] = 1;

                solve(col + 1, board, res, usedRows, usedLowerDiagonal, usedUpperDiagonal);

                board[row][col] = '.';

                usedRows[row] = 0;
                usedLowerDiagonal[row + col] = 0;
                usedUpperDiagonal[board.length - 1 + col - row] = 0;
            }
        }
    }

    public List<String> construct(char board[][]){
        List<String> res = new LinkedList<>();
        for(int i = 0; i < board.length; i++){
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
}

//https://leetcode.com/problems/n-queens/
