# 2401. [Longest Nice Subarray](https://leetcode.com/problems/longest-nice-subarray/?envType=daily-question&envId=2025-03-18)

## Solution

```java
class Solution {
    public int longestNiceSubarray(int[] nums) {
        int l = 0, usedBits = 0, maxLength = 0;

        for (int r = 0; r < nums.length; r++) {
            while ((usedBits & nums[r]) != 0) {
                usedBits ^= nums[l]; 
                l++;
            }

            usedBits |= nums[r];
            maxLength = Math.max(maxLength, r - l + 1);
        }

        return maxLength;
    }
}
```
