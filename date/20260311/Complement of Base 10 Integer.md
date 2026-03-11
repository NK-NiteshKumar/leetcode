# 1009. [Complement of Base 10 Integer](https://leetcode.com/problems/complement-of-base-10-integer/description/?envType=daily-question&envId=2026-03-11)

## Solution

```java
class Solution {
    public int bitwiseComplement(int n) {
        if (n == 0) return 1;
        int mask = (1 << (32 - Integer.numberOfLeadingZeros(n))) - 1;
        return n ^ mask;
    }
}
```
