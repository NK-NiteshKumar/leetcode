# 2938. [Separate Black and White Balls](https://leetcode.com/problems/separate-black-and-white-balls/description/?envType=daily-question&envId=2024-10-15)

## Solution

```java
class Solution {
    public long minimumSteps(String s) {
        long swap = 0;
        int black = 0; 
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') 
                swap += (long) black; 
            else
                black++; 
        }
        return swap;
    }
}
```
