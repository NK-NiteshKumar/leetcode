# 3396. [Minimum Number of Operations to Make Elements in Array Distinct](https://leetcode.com/problems/minimum-number-of-operations-to-make-elements-in-array-distinct/description/?envType=daily-question&envId=2025-04-08)

## Solution

```java
class Solution {

    public int minimumOperations(int[] nums) {
        boolean[] vis = new boolean[128];
        for (int i = nums.length - 1; i >= 0; i--) {
            if (vis[nums[i]]) {
                return i / 3 + 1;
            }
            vis[nums[i]] = true;
        }
        return 0;
    }
}
```
