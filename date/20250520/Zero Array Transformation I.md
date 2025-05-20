# 3355. [Zero Array Transformation I](https://leetcode.com/problems/zero-array-transformation-i/?envType=daily-question&envId=2025-05-20)

## Solution

```java
class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] diff = new int[n + 1];
        for (int[] q : queries) {
            diff[q[0]]--;
            if (q[1] + 1 < n) diff[q[1] + 1]++;
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += diff[i];
            if (nums[i] > -sum) return false;
        }
        return true;
    }
}
```
