# 190. [Reverse Bits](https://leetcode.com/problems/reverse-bits/description/?envType=daily-question&envId=2026-02-16)

## Solution

```java
class Solution {
    public int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res = (res << 1) | (n & 1);
            n >>>= 1;
        }
        return res;
    }
}
```
