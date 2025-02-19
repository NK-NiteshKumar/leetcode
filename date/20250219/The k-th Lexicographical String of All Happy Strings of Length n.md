# 1415. [The k-th Lexicographical String of All Happy Strings of Length n](https://leetcode.com/problems/the-k-th-lexicographical-string-of-all-happy-strings-of-length-n/description/?envType=daily-question&envId=2025-02-19)

## Solution

```java
class Solution {
    private String ans = "";

    private void solve(int len, int[] cnt, int n, char[] chars, StringBuilder s) {
        if (len == n) {
            if (--cnt[0] == 0) {
                ans = s.toString();
            }
            return;
        }
        for (char c : chars) {
            if (len == 0 || s.charAt(len - 1) != c) {
                s.append(c);
                solve(len + 1, cnt, n, chars, s);
                s.deleteCharAt(s.length() - 1);
                if (cnt[0] == 0) return; // Stop recursion early
            }
        }
    }

    public String getHappyString(int n, int k) {
        ans = "";
        solve(0, new int[]{k}, n, new char[]{'a', 'b', 'c'}, new StringBuilder());
        return ans;
    }
}
```
