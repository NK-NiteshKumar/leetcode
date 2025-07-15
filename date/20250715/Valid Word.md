# 3136. [Valid Word](https://leetcode.com/problems/valid-word/description/?envType=daily-question&envId=2025-07-15)

## Solution

```java
class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3) return false;

        int countVowels = 0;
        int countConsonants = 0;

        for (char ch : word.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) return false;

            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if (isVowel(lower)) {
                    countVowels++;
                } else {
                    countConsonants++;
                }
            }
        }

        if (countVowels == 0 || countConsonants == 0) return false;

        return true;
    }

    private boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }
}
```
