# 838. [Push Dominoes](https://leetcode.com/problems/push-dominoes/description/?envType=daily-question&envId=2025-05-02)

## Solution

```java
class Solution {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        int[] rightClosestL = new int[n];
        int[] leftClosestR = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            if (dominoes.charAt(i) == 'L')
                rightClosestL[i] = i;
            else if (dominoes.charAt(i) == '.')
                rightClosestL[i] = (i < n - 1) ? rightClosestL[i + 1] : -1;
            else
                rightClosestL[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            if (dominoes.charAt(i) == 'R')
                leftClosestR[i] = i;
            else if (dominoes.charAt(i) == '.')
                leftClosestR[i] = (i > 0) ? leftClosestR[i - 1] : -1;
            else
                leftClosestR[i] = -1;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int distL = rightClosestL[i] == -1 ? Integer.MAX_VALUE : Math.abs(i - rightClosestL[i]);
            int distR = leftClosestR[i] == -1 ? Integer.MAX_VALUE : Math.abs(i - leftClosestR[i]);

            if (distL == distR)
                result.append('.');
            else if (distL < distR)
                result.append('L');
            else
                result.append('R');
        }

        return result.toString();
    }
}
```
