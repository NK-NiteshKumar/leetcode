# 3223. [Minimum Length of String After Operations](https://leetcode.com/problems/minimum-length-of-string-after-operations/description/?envType=daily-question&envId=2025-01-13)

## Solution

```java
class Solution {
    public int minimumLength(String s) {
        HashMap<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) count.put(c, count.getOrDefault(c, 0) + 1);
        int minus = 0;
        for (int value : count.values()) {
            while (value >= 3) {
                minus += 2;
                value -= 2;
            }
        }
        return s.length() - minus;
    }
}
```
