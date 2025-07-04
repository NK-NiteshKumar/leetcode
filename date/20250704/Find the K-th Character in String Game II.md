# 3307. [Find the K-th Character in String Game II](https://leetcode.com/problems/find-the-k-th-character-in-string-game-ii/?envType=daily-question&envId=2025-07-04)

## Solution

```java
class Solution {
    public char kthCharacter(long k, int[] operations) {
        int res = 0;
        int bitIndex;
        while (k != 1) {
            bitIndex = 63 - Long.numberOfLeadingZeros(k);
            if ((1L << bitIndex) == k) {
                bitIndex--;
            }
            k = k - (1L << bitIndex);
            if (operations[bitIndex] != 0) {
                res++;
            }
        }
        return (char) ('a' + (res % 26));
    }
}
```
