# 1935. [Maximum Number of Words You Can Type](https://leetcode.com/problems/maximum-number-of-words-you-can-type/description/?envType=daily-question&envId=2025-09-15)

## Solution

```java
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> set = new HashSet<>();
        for (char ch : brokenLetters.toCharArray()) set.add(ch);

        int res = 0;
        boolean valid = true;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                if(valid) res++;
                valid = true;
            }
            else if (set.contains(ch)) valid = false;
        }

        if (valid) res++;
        return res;
    }
}
```
