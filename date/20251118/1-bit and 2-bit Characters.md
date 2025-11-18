# 717. [1-bit and 2-bit Characters](https://leetcode.com/problems/1-bit-and-2-bit-characters/description/?envType=daily-question&envId=2025-11-18)

## Solution

```java
class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        for( ; i<bits.length-1; ) {
            if(bits[i]==1) {
                i += 2;
            } else {
                i++;
            }
        }
        return i==bits.length-1;
    }
}
```
