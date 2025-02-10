# 3174. [Clear Digits](https://leetcode.com/problems/clear-digits/description/?envType=daily-question&envId=2025-02-10)

## Solution

```java
class Solution {
    public String clearDigits(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                if (res.length() > 0) {
                    res.deleteCharAt(res.length() - 1);
                }
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
```
