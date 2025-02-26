# 1749. [Maximum Absolute Sum of Any Subarray](https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/description/?envType=daily-question&envId=2025-02-26)

## Solution

```java
class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int positive = 0, negative = 0, prefixSum = 0, ans = 0;
        
        for (int n : nums) {
            prefixSum += n;
            ans = Math.max(ans, Math.max(Math.abs(prefixSum - negative), Math.abs(prefixSum - positive)));
            
            if (prefixSum >= 0) {
                positive = Math.max(positive, prefixSum);
            } else {
                negative = Math.min(negative, prefixSum);
            }
        }
        return ans;
    }
}
```
