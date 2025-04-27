# 3392. [Count Subarrays of Length Three With a Condition](https://leetcode.com/problems/count-subarrays-of-length-three-with-a-condition/description/?envType=daily-question&envId=2025-04-27)

## Solution

```java
class Solution {
    public int countSubarrays(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length - 1; ++i) {
            if (nums[i] % 2 == 0 && nums[i] / 2 == nums[i - 1] + nums[i + 1]) {
                count++;
            }
        }
        return count;
    }
}
```
