# 3461. [Check If Digits Are Equal in String After Operations I](https://leetcode.com/problems/check-if-digits-are-equal-in-string-after-operations-i/?envType=daily-question&envId=2025-10-23)

## Solution

```java
class Solution {
    public boolean hasSameDigits(String s) {
        int iteration = 0;
        char[] arr = s.toCharArray();

        while (arr.length - iteration != 2) {
            for (int i = 0; i < arr.length - 1 - iteration; i++) {
                arr[i] = (char)(((arr[i] - '0') + (arr[i + 1] - '0')) % 10 + '0');
            }
            iteration++;
        }

        return arr[0] == arr[1];
    }
}
```