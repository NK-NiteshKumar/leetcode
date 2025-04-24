# 2799. [Count Complete Subarrays in an Array](https://leetcode.com/problems/count-complete-subarrays-in-an-array/description/?envType=daily-question&envId=2025-04-24)

## Solution

```java
class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int left = 0, res = 0;
        int k = (int) Arrays.stream(nums).distinct().count();
        Map<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < nums.length; ++i) {
            mpp.put(nums[i], mpp.getOrDefault(nums[i], 0) + 1);
            while (mpp.size() == k) {
                res += nums.length - i;
                mpp.put(nums[left], mpp.get(nums[left]) - 1);
                if (mpp.get(nums[left]) == 0) mpp.remove(nums[left]);
                left++;
            }
        }
        return res;
    }
}
```
