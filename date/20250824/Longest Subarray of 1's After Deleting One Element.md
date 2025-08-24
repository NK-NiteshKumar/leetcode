# 1493. [Longest Subarray of 1's After Deleting One Element](https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/?envType=daily-question&envId=2025-08-24)

## Solution

```java
class Solution {
    public int longestSubarray(int[] nums) {
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();
        int cnt = 0, ones = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                cnt++;
                ones++;
            } else {
                left.put(i, cnt);
                cnt = 0;
            }
        }

        if (ones == 0) return 0;
        if (ones == nums.length) return nums.length - 1;

        cnt = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 1) {
                cnt++;
            } else {
                right.put(i, cnt);
                cnt = 0;
            }
        }

        int maxi = cnt;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                int leftCount = left.getOrDefault(i, 0);
                int rightCount = right.getOrDefault(i, 0);
                maxi = Math.max(maxi, leftCount + rightCount);
            }
        }

        return maxi;
    }
}
```
