# 2425. [Bitwise XOR of All Pairings](https://leetcode.com/problems/bitwise-xor-of-all-pairings/description/?envType=daily-question&envId=2025-01-16)

## Solution

```java
class Solution {
        public int xorAllNums(int[] A, int[] B) {
        int x = 0, y = 0;
        for (int a: A)
            x ^= a;
        for (int b: B)
            y ^= b;
        return (A.length % 2 * y) ^ (B.length % 2 * x);
    }
}
```
