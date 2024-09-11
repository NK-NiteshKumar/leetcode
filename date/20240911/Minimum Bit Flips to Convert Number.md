# 2220. [Minimum Bit Flips to Convert Number](https://leetcode.com/problems/minimum-bit-flips-to-convert-number/description/?envType=daily-question&envId=2024-09-11)

## Solution

```java
class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = 0; 
        int xor = start ^ goal;

        while(xor!=0){
            ans += xor & 1;
            xor >>=1;
        }
        return ans;
    }
}
```
