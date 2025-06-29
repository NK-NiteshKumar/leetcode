# 1498. [Number of Subsequences That Satisfy the Given Sum Condition](https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/description/?envType=daily-question&envId=2025-06-29)

## Solution

```java
class Solution {
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        int MOD = 1000000007;

        Arrays.sort(nums);

        int[] power = new int[n];
        power[0] = 1;
        for (int i = 1; i < n; i++) {
            power[i] = (power[i - 1] * 2) % MOD;
        }

        int count = 0;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                count = (count + power[right - left]) % MOD;
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}
```
