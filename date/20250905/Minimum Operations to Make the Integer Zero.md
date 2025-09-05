# 2749. [Minimum Operations to Make the Integer Zero](https://leetcode.com/problems/minimum-operations-to-make-the-integer-zero/description/?envType=daily-question&envId=2025-09-05)

## Solution

```java
class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for (int t = 0; t <= 60; t++) {
            long s = (long) num1 - (long) t * num2;
            if (s < 0) continue;
            if (s < t) continue;
            int ones = Long.bitCount(s);
            if (ones <= t) return t;
        }
        return -1;
    }
}
```
