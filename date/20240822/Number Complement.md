# 476. [Number Complement](https://leetcode.com/problems/number-complement/description/?envType=daily-question&envId=2024-08-22)

## Solution

```java
class Solution {
    public int findComplement(int num) {
        if (num == 0) return 1;

        int bitLength = Integer.toBinaryString(num).length();
        
        int mask = (1 << bitLength) - 1;
        
        return num ^ mask;
    }
}
```
