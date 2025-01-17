# 2683. [Neighboring Bitwise XOR](https://leetcode.com/problems/neighboring-bitwise-xor/description/?envType=daily-question&envId=2025-01-17)

## Solution

```java
class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int xr = 0;
        for (int x: derived) {
            xr = xr ^ x;
        }
        return xr == 0;
    }
}
```
