# 2348. [Number of Zero-Filled Subarrays](https://leetcode.com/problems/number-of-zero-filled-subarrays/description/?envType=daily-question&envId=2025-08-19)

## Solution

```java
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;
        int n = nums.length,curr = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i] == 0)
            {
                curr++;
            }
            else
            {
                ans += (1L * curr*(curr+1)/2);
                curr = 0;
            }
        }
        ans += (1L * curr*(curr+1)/2);
        return ans;
    }
}
```
