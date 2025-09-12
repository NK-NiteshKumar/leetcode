# 3227. [Vowels Game in a String](https://leetcode.com/problems/vowels-game-in-a-string/description/?envType=daily-question&envId=2025-09-12)

## Solution

```java
class Solution {
    public boolean doesAliceWin(String s) {
        String vowels = "aeiou";
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }
}
```
