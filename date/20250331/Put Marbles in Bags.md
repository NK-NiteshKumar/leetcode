# 2551. [Put Marbles in Bags](https://leetcode.com/problems/put-marbles-in-bags/description/?envType=daily-question&envId=2025-03-31)

## Solution

```java
class Solution {
    public int putMarbles(int[] weights, int k) {
        int n = weights.length;
        int[] splits = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            splits[i] = weights[i] + weights[i + 1];
        }

        Arrays.sort(splits);

        int minSplit = 0;
        for (int i = 0; i < k - 1; i++) {
            minSplit += splits[i];
        }

        int maxSplit = 0;
        for (int i = 0; i < k - 1; i++) {
            maxSplit += splits[n - 2 - i];
        }

        return maxSplit - minSplit;
    }
}
```
