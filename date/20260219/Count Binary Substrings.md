# 696. [Count Binary Substrings](https://leetcode.com/problems/count-binary-substrings/description/?envType=daily-question&envId=2026-02-19)

## Solution

```java
class Solution {
    public int countBinarySubstrings(String s) {
        int res = 0, prev = 0, strk = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) strk++;
            else {
                prev = strk;
                strk = 1;
            }
            if (strk <= prev) res++;
        }
        return res;
    }
}
```
