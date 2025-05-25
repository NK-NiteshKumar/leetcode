# 2131. [Longest Palindrome by Concatenating Two Letter Words](https://leetcode.com/problems/longest-palindrome-by-concatenating-two-letter-words/description/?envType=daily-question&envId=2025-05-25)

## Solution

```java
class Solution {
    public int longestPalindrome(String[] words) {
        int[][] freq = new int[26][26];
        int pairCount = 0;

        for (String word : words) {
            int first = word.charAt(0) - 'a';
            int second = word.charAt(1) - 'a';

            if (freq[second][first] > 0) {
                pairCount += 4;
                freq[second][first]--;
            } else {
                freq[first][second]++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i][i] > 0) {
                pairCount += 2;
                break;
            }
        }

        return pairCount;
    }
}
```
