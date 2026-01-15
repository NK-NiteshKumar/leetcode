# 2943. [Maximize Area of Square Hole in Grid](https://leetcode.com/problems/maximize-area-of-square-hole-in-grid/description/?envType=daily-question&envId=2026-01-15)

## Solution

```java
class Solution {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);

        int maxiH = 1, maxiV = 1, maxi = 1;

        for (int i = 1; i < hBars.length; i++) {
            if (hBars[i] == hBars[i - 1] + 1) {
                maxi++;
            } else {
                maxiH = Math.max(maxiH, maxi);
                maxi = 1;
            }
        }
        maxiH = Math.max(maxiH, maxi);

        maxi = 1;

        for (int i = 1; i < vBars.length; i++) {
            if (vBars[i] == vBars[i - 1] + 1) {
                maxi++;
            } else {
                maxiV = Math.max(maxiV, maxi);
                maxi = 1;
            }
        }
        maxiV = Math.max(maxiV, maxi);

        int side = Math.min(maxiH+1, maxiV+1);
        return side * side;
    }
}
```
