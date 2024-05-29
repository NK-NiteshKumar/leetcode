# 1404. [Number of Steps to Reduce a Number in Binary Representation to One](https://leetcode.com/problems/number-of-steps-to-reduce-a-number-in-binary-representation-to-one/description/?envType=daily-question&envId=2024-05-29)

## Solution

```java
class Solution {
    public int numSteps(String s) {
        int n = s.length(), carry = 0, ans = 0;
        
        for (int i = n - 1; i >= 1; i--) {
            if ((s.charAt(i) - '0' + carry) % 2 == 1) {
                ans += 2;
                carry = 1;
            } else {
                ans += 1;
            }
        }
        
        return ans + carry;
    }
}
```
