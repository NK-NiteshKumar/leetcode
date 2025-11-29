# 3512. [Minimum Operations to Make Array Sum Divisible by K](https://leetcode.com/problems/minimum-operations-to-make-array-sum-divisible-by-k/description/?envType=daily-question&envId=2025-11-29)

## Solution

```java
class Solution {
    public int minOperations(int[] nums, int k) {
        for(int i = 1;i<nums.length;i++) nums[0] += nums[i];
        return nums[0] % k;
    }
}
```
