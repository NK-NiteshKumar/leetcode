# 3304. [Find the K-th Character in String Game I](https://leetcode.com/problems/find-the-k-th-character-in-string-game-i/description/?envType=daily-question&envId=2025-07-03)

## Solution

```java
class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");
        while (sb.length() < k) {
            int size = sb.length();
            for (int i = 0; i < size; i++) {
                sb.append((char) ('a' + ((sb.charAt(i) - 'a') + 1) % 26));
            }
        }
        return sb.charAt(k - 1);
    }
}
```
