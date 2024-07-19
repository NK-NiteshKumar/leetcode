# 1380. [Lucky Numbers in a Matrix](https://leetcode.com/problems/lucky-numbers-in-a-matrix/description/?envType=daily-question&envId=2024-07-19)

## Solution

```java
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int row = i, rowMin = Integer.MAX_VALUE, rowMinCol = -1;
            for (int j = 0; j < m; j++) {
                if (rowMin > matrix[row][j]) {
                    rowMin = matrix[row][j];
                    rowMinCol = j;
                }
            }
            int col = rowMinCol, colMax = Integer.MIN_VALUE, colMaxRow = -1;
            for (int k = 0; k < n; k++) {
                if (colMax < matrix[k][col]) {
                    colMax = matrix[k][col];
                    colMaxRow = k;
                }
            }
            if (i == colMaxRow) {
                return Arrays.asList(matrix[i][rowMinCol]);
            }
        }
        return ans;
    }
}
```
