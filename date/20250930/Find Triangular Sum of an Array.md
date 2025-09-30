# 2221. [Find Triangular Sum of an Array](https://leetcode.com/problems/find-triangular-sum-of-an-array/description/?envType=daily-question&envId=2025-09-30)

## Solution

```java
class Solution {
    public int triangularSum(int[] nums) {
        int n = nums.length;
        
        for (int size = n; size > 1; size--) {
            for (int i = 0; i < size - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
        }

        return nums[0];
    }
}
```
