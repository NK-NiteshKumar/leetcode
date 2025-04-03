# 2874. [Maximum Value of an Ordered Triplet II](https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-ii/description/?envType=daily-question&envId=2025-04-03)

## Solution

```java
class Solution {
    public long maximumTripletValue(int[] nums) {
        long res = 0;
        int max_diff = 0, max_num = 0;

        for(int i = 0; i < nums.length; i++) {
            res = Math.max(res, (long) max_diff * nums[i]);
            max_diff = Math.max(max_diff, max_num - nums[i]);
            max_num = Math.max(max_num, nums[i]);
        }
        return res;
    }
}
```
