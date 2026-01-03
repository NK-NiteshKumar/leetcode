# 1411. [Number of Ways to Paint N × 3 Grid](https://leetcode.com/problems/number-of-ways-to-paint-n-3-grid/description/?envType=daily-question&envId=2026-01-03)

## Solution

```java
class Solution {
    public int numOfWays(int n) {
        final int MOD = 1000000007;
        long x = 6, y = 6;
        
        for (int i = 2; i <= n; i++) {
            long new_x = (3 * x + 2 * y) % MOD;
            long new_y = (2 * x + 2 * y) % MOD;
            x = new_x;
            y = new_y;
        }
        
        return (int)((x + y) % MOD);
    }
}
```
