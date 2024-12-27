# 1014. [Best Sightseeing Pair](https://leetcode.com/problems/best-sightseeing-pair/description/?envType=daily-question&envId=2024-12-27)

## Solution

```java
class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int ans = Integer.MIN_VALUE;
        int m = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] - i + m > ans) 
                ans = values[i] - i + m;
            
            if (values[i] + i > m) 
                m = values[i] + i;
        }

        return ans;
    }
}
```
