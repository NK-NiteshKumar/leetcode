# 2537. [Count the Number of Good Subarrays](https://leetcode.com/problems/count-the-number-of-good-subarrays/description/?envType=daily-question&envId=2025-04-16)

## Solution

```java
class Solution {
    public long countGood(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        long prev_count = 0, res = 0;
        int left = 0;
        
        for (int right = 0; right < nums.length; right++) {
            prev_count += freq.getOrDefault(nums[right], 0);
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);
            
            while (prev_count >= k) {
                res += nums.length - right;
                prev_count -= freq.get(nums[left]) - 1;
                freq.put(nums[left], freq.get(nums[left]) - 1);
                left++;
            }
        }
        
        return res;
    }
}
```
