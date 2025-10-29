# 3370. [Smallest Number With All Set Bits](https://leetcode.com/problems/smallest-number-with-all-set-bits/description/?envType=daily-question&envId=2025-10-29)

## Solution

```java
class Solution {
    public int smallestNumber(int n) {
        int msb = 31 - Integer.numberOfLeadingZeros(n);
        
        int result = (1 << (msb + 1)) - 1;
        
        return result;
    }
}
```
