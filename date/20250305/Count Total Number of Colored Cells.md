# 2579. [Count Total Number of Colored Cells](https://leetcode.com/problems/count-total-number-of-colored-cells/description/?envType=daily-question&envId=2025-03-05)

## Solution

```java
class Solution {
    public long coloredCells(int n) {
        if(n == 1) return 1;
        return 2L * n * (n-1) + 1;
    }
}
```
