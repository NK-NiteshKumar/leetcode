# 3133. [Minimum Array End](https://leetcode.com/problems/minimum-array-end/description/?envType=daily-question&envId=2024-11-09)

## Solution

```java
class Solution {
    public long minEnd(int n, int x) {
        long result = x;
        long remaining = n - 1;
        long position = 1;
        
        while (remaining != 0) {
            if ((x & position) == 0) {
                result |= (remaining & 1) * position;
                remaining >>= 1;
            }
            position <<= 1;
        }
        
        return result;
    }
}
```
