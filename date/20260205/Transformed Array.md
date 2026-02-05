# 3379. [Transformed Array](https://leetcode.com/problems/transformed-array/description/?envType=daily-question&envId=2026-02-05)

## Solution

```java
class Solution {
    public int[] constructTransformedArray(int[] A) {
        int n = A.length;
        int OFFSET = 1 << 7;
        int MASK = (1 << 8) - 1;

        for (int i = 0; i < n; i++)
            A[i] += OFFSET;

        for (int i = 0; i < n; i++) {
            int cur = A[i] - OFFSET;
            int idx = ((i + cur) % n + n) % n;
            int val = A[idx] & MASK;
            A[i] |= val << 8;
        }

        for (int i = 0; i < n; i++)
            A[i] = (A[i] >> 8) - OFFSET;

        return A;
    }
}
```
