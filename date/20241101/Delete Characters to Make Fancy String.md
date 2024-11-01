# 1957. [Delete Characters to Make Fancy String](https://leetcode.com/problems/delete-characters-to-make-fancy-string/?envType=daily-question&envId=2024-11-01)

## Solution

```java
class Solution {
    public String makeFancyString(String s) {
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        int n = s.length(), cnt = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == ans.charAt(ans.length() - 1)) {
                cnt++;
                if (cnt < 3) {
                    ans.append(s.charAt(i));
                }
            } else {
                cnt = 1;
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
```
