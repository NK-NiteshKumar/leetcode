# 231. [Power of Two](https://leetcode.com/problems/power-of-two/description/?envType=daily-question&envId=2025-08-09)

## Solution 

```java
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & n - 1) == 0;
    }
}

```