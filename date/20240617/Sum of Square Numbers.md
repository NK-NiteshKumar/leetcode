# 633. [Sum of Square Numbers](https://leetcode.com/problems/sum-of-square-numbers/description/?envType=daily-question&envId=2024-06-17)

## Solution

```java
class Solution {
    public boolean judgeSquareSum(int c) {
        for (long a = 0; a * a <= c; a++) {
            long b = (long) Math.sqrt(c - a * a);
            if (b * b == c - a * a) {
                return true;
            }
        }
        return false;
    }
}
```
