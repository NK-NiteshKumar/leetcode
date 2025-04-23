# 1399. [Count Largest Group](https://leetcode.com/problems/count-largest-group/description/?envType=daily-question&envId=2025-04-23)

## Solution

```java
class Solution {
    public int countLargestGroup(int n) {
        int[] freq = new int[40];
        int maxCount = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0, x = i;
            while (x > 0) {
                sum += x % 10;
                x /= 10;
            }
            freq[sum]++;
            maxCount = Math.max(maxCount, freq[sum]);
        }

        int groupCount = 0;
        for (int count : freq)
            if (count == maxCount) groupCount++;

        return groupCount;
    }
}
```
