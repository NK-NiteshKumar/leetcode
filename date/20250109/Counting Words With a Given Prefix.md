# 2185. [Counting Words With a Given Prefix](https://leetcode.com/problems/counting-words-with-a-given-prefix/description/?envType=daily-question&envId=2025-01-09)

## Solution

```java
class Solution {
    public int prefixCount(String[] words, String pref) {
        int c = 0;
        int n = pref.length();
        for (String w : words) {
            if (w.length() >= n && w.startsWith(pref)) {
                c++;
            }
        }
        return c;
    }
}
```
