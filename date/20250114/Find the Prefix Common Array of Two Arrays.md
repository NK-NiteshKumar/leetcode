# 2657. [Find the Prefix Common Array of Two Arrays](https://leetcode.com/problems/find-the-prefix-common-array-of-two-arrays/description/?envType=daily-question&envId=2025-01-14)

## Solution

```java
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        boolean[] seen = new boolean[51];
        int[] ans = new int[n];
        int common = 0;

        for (int i = 0; i < n; i++) {
            if (seen[A[i]]) {
                common++;
            } else {
                seen[A[i]] = true;
            }
            if (seen[B[i]]) {
                common++;
            } else {
                seen[B[i]] = true;
            }
            ans[i] = common;
        }
        return ans;
    }
}
```
