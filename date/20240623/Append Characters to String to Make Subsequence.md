# 2486. [Append Characters to String to Make Subsequence](https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/description/?envType=daily-question&envId=2024-06-03)

## Solution

```java
class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0, j = 0;
        int n = s.length();
        int m = t.length();

        while (j < m && i < n) {
            if (t.charAt(j) == s.charAt(i)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
        return m - j;
    }
}
```
