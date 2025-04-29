# 2962. [Count Subarrays Where Max Element Appears at Least K Times](https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/description/?envType=daily-question&envId=2025-04-29)

## Solution

```java
class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        
        int i = 0;
        int countmax = 0;
        long result = 0;
        
        for (int j = 0; j < n; j++) {
            if (nums[j] == max) {
                countmax++;
            }
            
            while (countmax >= k) {
                result += (n - j);
                if (nums[i] == max) {
                    countmax--;
                }
                i++;
            }
        }
        
        return result;
    }
}
```
