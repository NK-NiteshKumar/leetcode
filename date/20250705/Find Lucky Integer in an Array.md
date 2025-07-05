# 1394. [Find Lucky Integer in an Array](https://leetcode.com/problems/find-lucky-integer-in-an-array/description/?envType=daily-question&envId=2025-07-05)

## Solution

```java
class Solution {
    public static int findLucky(int[] numbers) { 
        int[] freq = new int[501]; 

        for (int num : numbers) freq[num]++; 

        for (int i = 500; i > 0; i--) if (i == freq[i]) return i;  

        return -1;
    }
}
```
