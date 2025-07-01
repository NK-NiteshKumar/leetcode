# 3330. [Find the Original Typed String I](https://leetcode.com/problems/find-the-original-typed-string-i/description/?envType=daily-question&envId=2025-07-01)

## Solution

```java
class Solution {
    public int possibleStringCount(String word) {
        int ans = 1;

        for (int i = 1; i < word.length(); i++)  {
            if (word.charAt(i) == word.charAt(i - 1))  {
                ans++; 
            }
        }

        return ans;
    }
}
```
