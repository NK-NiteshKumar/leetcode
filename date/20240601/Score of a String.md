# 3110. [Score of a String](https://leetcode.com/problems/score-of-a-string/description/?envType=daily-question&envId=2024-06-01)

## Solution

```java
class Solution {
    public int scoreOfString(String s) {
        
        int ans = 0;

        for(int i = 0; i < s.length()-1; i++) {
            ans += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return ans;
    }
}
```
