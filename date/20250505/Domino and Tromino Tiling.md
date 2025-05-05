# 790. [Domino and Tromino Tiling](https://leetcode.com/problems/domino-and-tromino-tiling/description/?envType=daily-question&envId=2025-05-05)

## Solution

```java
class Solution {
    private static final long MOD = 1_000_000_007;

    private long[][] mul(long[][] a, long[][] b) {
        long[][] x = new long[4][4];
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                if (a[i][j] != 0) {
                    for (int k = 0; k < 4; ++k) {
                        if (b[j][k] != 0) {
                            x[i][k] = (x[i][k] + a[i][j] * b[j][k] % MOD) % MOD;
                        }
                    }
                }
            }
        }
        return x;
    }

    public int numTilings(int n) {
        long[][] mat = {
            {0, 1, 0, 1},
            {1, 1, 0, 1},
            {0, 2, 0, 1},
            {0, 0, 1, 0}
        };
        long[][] ans = new long[4][4];
        for (int i = 0; i < 4; ++i) ans[i][i] = 1;

        while (n > 0) {
            if ((n & 1) == 1) ans = mul(ans, mat);
            mat = mul(mat, mat);
            n >>= 1;
        }

        return (int) ans[1][1];
    }
}
```

---

```java
class Solution {
    public int numTilings(int n) {
        long[] dp = new long[n + 3]; 
        dp[0] = 1; 
        dp[1] = 2; 
        dp[2] = 5;
        for (int i = 3; i < n; i ++) {
            dp[i] = (dp[i - 1] * 2 + dp[i - 3]) % 1000000007;
        }
        return (int)dp[n - 1];
    }
}
```
