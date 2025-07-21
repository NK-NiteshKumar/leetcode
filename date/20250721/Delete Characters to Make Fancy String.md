# 1957. [Delete Characters to Make Fancy String](https://leetcode.com/problems/delete-characters-to-make-fancy-string/description/?envType=daily-question&envId=2025-07-21)

## Solution

```java
class Solution {
    public String makeFancyString(String s) {
        char[] arr = s.toCharArray();
        char prevChar = arr[0];
        int prevCharCount = 1;
        int k = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != prevChar) {
                prevChar = arr[i];
                prevCharCount = 0;
            }

            if (++prevCharCount > 2) continue;
            
            arr[k++] = arr[i];
        }

        return new String(arr, 0, k);
    }
}
```
