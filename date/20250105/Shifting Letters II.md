# 2381. [Shifting Letters II](https://leetcode.com/problems/shifting-letters-ii/description/?envType=daily-question&envId=2025-01-05)

## Solution

```java
class Solution {
    public String shiftingLetters(String s, int[][] Q) {
        int n = s.length();
        int[] A = new int[n];
        for (int[] it : Q) {
            int l = it[0], r = it[1], t = it[2];
            if (t == 1) {
                A[l] += 1;
                if (r + 1 < n) {
                    A[r + 1] -= 1;
                }
            } else {
                A[l] -= 1;
                if (r + 1 < n) {
                    A[r + 1] += 1;
                }
            }
        }
        for (int i = 1; i < n; ++i) {
            A[i] += A[i - 1];
        }
        char[] chars = s.toCharArray();
        for (int i = 0; i < n; ++i) {
            int shift = (A[i] % 26 + 26) % 26; 
            int ch = chars[i] - 'a';
            ch = (ch + shift) % 26;
            chars[i] = (char) ('a' + ch);
        }
        return new String(chars);
    }
}
```
