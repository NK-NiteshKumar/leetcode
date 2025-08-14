# 2264. [Largest 3-Same-Digit Number in String](https://leetcode.com/problems/largest-3-same-digit-number-in-string/description/?envType=daily-question&envId=2025-08-14)

## Solution

```java
class Solution {
    public String largestGoodInteger(String num) {
        String[] numbers = {"999","888","777","666","555","444","333","222","111","000"};
        for (String s : numbers) {
            if (num.contains(s)) {
                return s;
            }
        }
        return "";
    }
}
```
