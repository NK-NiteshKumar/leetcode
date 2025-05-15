# 2900. [Longest Unequal Adjacent Groups Subsequence I](https://leetcode.com/problems/longest-unequal-adjacent-groups-subsequence-i/description/?envType=daily-question&envId=2025-05-15)

## Solution

```java
class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> res = new ArrayList<>();
        res.add(words[0]);
        for (int i = 1; i < groups.length; ++i) {
            if (groups[i] != groups[i - 1]) {
                res.add(words[i]);
            }
        }
        return res;
    }
}
```
