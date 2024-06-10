# 1051. [Height Checker](https://leetcode.com/problems/height-checker/description/?envType=daily-question&envId=2024-06-10)

## Solution

```java
class Solution {
    public int heightChecker(int[] heights) {
        int[] hCopy = Arrays.copyOf(heights, heights.length);
        Arrays.sort(hCopy);

        int ans = 0;
        for (int i = 0; i < hCopy.length; i++) {
            if (hCopy[i] != heights[i]) {
                ans++;
            }
        }

        return ans;
    }
}
```
