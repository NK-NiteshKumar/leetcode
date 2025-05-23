# 3068. [Find the Maximum Sum of Node Values](https://leetcode.com/problems/find-the-maximum-sum-of-node-values/description/?envType=daily-question&envId=2025-05-23)

## Solution

```java
import java.util.*;

class Solution {
    public long maximumValueSum(int[] v, int k, int[][] edges) {
        long total = 0;
        for (int val : v) {
            total += val;
        }

        long totalDiff = 0;
        int positiveCount = 0;
        long minAbsDiff = Integer.MAX_VALUE;

        for (int val : v) {
            long diff = (val ^ k) - val;
            if (diff > 0) {
                totalDiff += diff;
                positiveCount++;
            }
            minAbsDiff = Math.min(minAbsDiff, Math.abs(diff));
        }

        if (positiveCount % 2 == 1) {
            totalDiff -= minAbsDiff;
        }

        return total + totalDiff;
    }
}
```
