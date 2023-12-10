class Transpose {
    public int[][] transpose(int[][] matrix) {
        int row=matrix.length;
        int col=matrix[0].length;
        int result[][]=new int[col][row];
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
            result[i][j]=matrix[j][i];
            }
        }
        return result;
    }
}

//https://leetcode.com/problems/transpose-matrix/
