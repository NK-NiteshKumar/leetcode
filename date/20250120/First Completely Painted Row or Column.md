# 2661. [First Completely Painted Row or Column](https://leetcode.com/problems/first-completely-painted-row-or-column/description/?envType=daily-question&envId=2025-01-20)

## Solution

```java
class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        Map<Integer, int[]> pos = new HashMap<>();
        
        for(int i = 0; i < row; i++)
            for(int j = 0; j < col; j++)
                pos.put(mat[i][j], new int[]{i, j});
        
        int[] rCnt = new int[row];
        int[] cCnt = new int[col];
        
        for(int i = 0; i < arr.length; i++) {
            int[] p = pos.get(arr[i]);
            rCnt[p[0]]++;
            cCnt[p[1]]++;
            if(rCnt[p[0]] == col || cCnt[p[1]] == row)
                return i;
        }
        return arr.length - 1;
    }
}
```
