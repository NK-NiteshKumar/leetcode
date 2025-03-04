# 1780. [Check if Number is a Sum of Powers of Three](https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/description/?envType=daily-question&envId=2025-03-04)

## Solution

```java
class Solution {
    public boolean checkPowersOfThree(int n) {
        int power = 1;
        while (power * 3 <= n) {
            power *= 3;
        }
        while (n > 0 && power > 0) {
            if (n >= power) {
                n -= power;
            }
            power /= 3;
        }
        return n == 0;  
    }
}
```
