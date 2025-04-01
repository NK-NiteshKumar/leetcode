# 2140. [Solving Questions With Brainpower](https://leetcode.com/problems/solving-questions-with-brainpower/description/?envType=daily-question&envId=2025-04-01)

## Solution

```java
class Solution {
    public long solve(int idx, int n, int[][] questions, long[] dp) {
        if (idx >= n) {
            return 0;
        }

        if (dp[idx] != -1) {
            return dp[idx];
        }

        long take = questions[idx][0] + solve(idx + questions[idx][1] + 1, n, questions, dp);

        long notTake = solve(idx + 1, n, questions, dp);

        return dp[idx] = Math.max(take, notTake);
    }

    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n + 1];

        java.util.Arrays.fill(dp, -1);

        return solve(0, n, questions, dp);
    }
}
```
