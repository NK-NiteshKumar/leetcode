# 409. [Longest Palindrome](https://leetcode.com/problems/longest-palindrome/description/?envType=daily-question&envId=2024-06-04)

## Solution

```java
class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        int ans = 0;
        HashMap<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
        freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        boolean isOdd = false;
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            int fr = entry.getValue();
            if (fr % 2 == 0) {
                ans += fr;
            } else {
                ans += fr - 1;
                isOdd = true;
            }
        }
        return isOdd ? ans + 1 : ans;
    }
}
```
