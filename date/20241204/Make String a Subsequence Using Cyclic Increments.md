# 2825. [Make String a Subsequence Using Cyclic Increments](https://leetcode.com/problems/make-string-a-subsequence-using-cyclic-increments/description/?envType=daily-question&envId=2024-12-04)

## Solution

```java
class Solution {
    public boolean canMakeSubsequence(String source, String target) {
        int srcLen = source.length();
        int tgtLen = target.length();
        int srcIdx = 0;
        int tgtIdx = 0;
        
        while (srcIdx < srcLen && tgtIdx < tgtLen) {
            char srcChar = source.charAt(srcIdx);
            char tgtChar = target.charAt(tgtIdx);
            
            if (srcChar == tgtChar || 
                (srcChar == 'z' && tgtChar == 'a') || 
                (srcChar + 1 == tgtChar)) {
                srcIdx++;
                tgtIdx++;
            } else {
                srcIdx++;
            }
        }
        return tgtIdx == tgtLen;
    }
}
```
