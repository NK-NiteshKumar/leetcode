# 3070. [Count Submatrices with Top-Left Element and Sum Less Than k](https://leetcode.com/problems/count-submatrices-with-top-left-element-and-sum-less-than-k/description/?envType=daily-question&envId=2026-03-18)

## Solution

```java
class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int ans = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                long up = (i > 0 ? grid[i - 1][j] : 0);
                long left = (j > 0 ? grid[i][j - 1] : 0);
                long diag = (i > 0 && j > 0 ? grid[i - 1][j - 1] : 0);

                grid[i][j] = (int)(grid[i][j] + up + left - diag);

                if (grid[i][j] <= k) {
                    ans++;
                } else {
                    if (j == 0) return ans;
                    break;
                }
            }
        }

        return ans;
    }
}
```
