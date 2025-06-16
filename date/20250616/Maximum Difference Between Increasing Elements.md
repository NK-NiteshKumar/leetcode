# 2016. [Maximum Difference Between Increasing Elements](https://leetcode.com/problems/maximum-difference-between-increasing-elements/description/?envType=daily-question&envId=2025-06-16)

## Solution

```java
class Solution {
    public int maximumDifference(int[] nums) {
        int n = nums.length;
        int minElement = nums[0];
        int maxDiff = -1;

        for (int j = 1; j < n; j++) {
            if (nums[j] > minElement) {
                maxDiff = Math.max(maxDiff, nums[j] - minElement);
            } else {
                minElement = nums[j];
            }
        }

        return maxDiff;
    }
}
```
