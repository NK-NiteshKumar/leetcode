# 3403. [Find the Lexicographically Largest String From the Box I](https://leetcode.com/problems/find-the-lexicographically-largest-string-from-the-box-i/description/?envType=daily-question&envId=2025-06-04)

## Solution

```java
class Solution {
    public String answerString(String word, int numFriends) {
        int n = word.length();
        if (numFriends == 1) {
            return word;
        }

        int longestPossible = n - (numFriends - 1);
        String result = "";

        for (int i = 0; i < n; i++) {
            int canTakeLength = Math.min(longestPossible, n - i);
            String sub = word.substring(i, i + canTakeLength);
            if (sub.compareTo(result) > 0) {
                result = sub;
            }
        }

        return result;
    }
}
```
