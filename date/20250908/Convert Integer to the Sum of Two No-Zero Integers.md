# 1317. [Convert Integer to the Sum of Two No-Zero Integers](https://leetcode.com/problems/convert-integer-to-the-sum-of-two-no-zero-integers/description/?envType=daily-question&envId=2025-09-08)

## Solution

```java
class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a = n - 1, b = 1;
        while (String.valueOf(a).contains("0") || String.valueOf(b).contains("0")) {
            a--;
            b++;
        }
        return new int[]{a, b};
    }
}
```
