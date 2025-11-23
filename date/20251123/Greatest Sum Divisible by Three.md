# 1262. [Greatest Sum Divisible by Three](https://leetcode.com/problems/greatest-sum-divisible-by-three/description/?envType=daily-question&envId=2025-11-23)

## Solution

```java
class Solution {
    public int maxSumDivThree(int[] nums) {
        int[] dp = {0, 0, 0};

        for (int num : nums) {
            int[] prev = dp.clone();
            for (int cur : prev) {
                int s = cur + num;
                dp[s % 3] = Math.max(dp[s % 3], s);
            }
        }
        return dp[0];
    }
}
```
