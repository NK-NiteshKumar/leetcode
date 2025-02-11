# 1910. [Remove All Occurrences of a Substring](https://leetcode.com/problems/remove-all-occurrences-of-a-substring/description/?envType=daily-question&envId=2025-02-11)

## Solution

```java
class Solution {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)) s = s.replaceFirst(part, "");
        return s;
    }
}
```
