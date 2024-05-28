# 1208. [Get Equal Substrings Within Budget](https://leetcode.com/problems/get-equal-substrings-within-budget/description/?envType=daily-question&envId=2024-05-28)

## Solution

```java
class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int i = 0, j = 0, ans = 0, curCost = 0;

        while (j < n) {
            curCost += Math.abs(t.charAt(j) - s.charAt(j));
            while (i < n && curCost > maxCost) {
                curCost -= Math.abs(t.charAt(i) - s.charAt(i));
                i++;
            }
            ans = Math.max(ans, j - i + 1);
            j++;
        }

        return ans;
    }
}
```
