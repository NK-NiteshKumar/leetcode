# 961. [N-Repeated Element in Size 2N Array](https://leetcode.com/problems/n-repeated-element-in-size-2n-array/description/?envType=daily-question&envId=2026-01-02)

## Solution

```java
class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length - 2;
        for(int i = 0; i < n; i++) {
            if(nums[i] == nums[i + 1] || nums[i] == nums[i + 2]) return nums[i];
        }
        return nums[n + 1];
    }
}
```
