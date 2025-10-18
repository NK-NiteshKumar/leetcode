# 3397. [Maximum Number of Distinct Elements After Operations](https://leetcode.com/problems/maximum-number-of-distinct-elements-after-operations/description/?envType=daily-question&envId=2025-10-18)

## Solution

```java
class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        if (nums.length <= (k * 2) + 1) return nums.length;
        Arrays.sort(nums);
        long current = Long.MIN_VALUE; 
        int res = 0;
        
        for (int num : nums) {
            long target = Math.max(current + 1, num - k);

            if (target <= num + k) {
                current = target;
                res++;
            } else {
                current = Math.max(current, num);
            }
        }
        
        return res;
    }
}
```
