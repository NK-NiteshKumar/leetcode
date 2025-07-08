# 1751. [Maximum Number of Events That Can Be Attended II](https://leetcode.com/problems/maximum-number-of-events-that-can-be-attended-ii/description/?envType=daily-question&envId=2025-07-08)

## Solution

```java
class Solution {
    public int maxValue(int[][] e, int k) {
        Arrays.sort(e, (a, b) -> a[0] - b[0]);
        int n = e.length, dp[][] = new int[n + 1][k + 1];
        for (int i = n - 1; i >= 0; i--) {
            int l = i + 1, r = n, t = e[i][1], m, next = n;
            while (l < r)
                if (e[m = l + (r - l) / 2][0] > t)
                    r = m;
                else
                    l = m + 1;
            for (int j = 0; j < k; j++)
                dp[i][j] = Math.max(dp[i + 1][j], dp[l][j + 1] + e[i][2]);
        }
        return dp[0][0];
    }
}
```
