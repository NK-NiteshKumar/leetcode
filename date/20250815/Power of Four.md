# 342. [Power of Four](https://leetcode.com/problems/power-of-four/description/?envType=daily-question&envId=2025-08-15)

## Solution

```java
class Solution {
    public boolean isPowerOfFour(int n) {
        while(n>=4) {
            if(n%4 != 0) return false;
            n/=4;
        }
        return n==1;
    }
}
```
