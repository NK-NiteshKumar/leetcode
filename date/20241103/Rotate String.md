# 796. [Rotate String](https://leetcode.com/problems/rotate-string/description/?envType=daily-question&envId=2024-11-03)

## Solution

```java
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }
}
```
