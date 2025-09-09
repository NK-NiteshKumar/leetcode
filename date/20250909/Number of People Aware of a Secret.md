# 2327. [Number of People Aware of a Secret](https://leetcode.com/problems/number-of-people-aware-of-a-secret/description/?envType=daily-question&envId=2025-09-09)

## Solution

```java
class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int MOD = (int) 1e9 + 7;

        long[] dp = new long[n + 1];
        
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            int start = Math.max(1, i - forget + 1);
            int end = i - delay;
            
            for (int j = start; j <= end; j++) {
                dp[i] = (dp[i] + dp[j]) % MOD;
            }
        }
        
        long result = 0;

        for (int i = Math.max(1, n - forget + 1); i <= n; i++) {
            result = (result + dp[i]) % MOD;
        }
        
        return (int) result;
    }
}
```
