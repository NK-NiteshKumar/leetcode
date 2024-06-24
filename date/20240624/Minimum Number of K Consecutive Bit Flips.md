# 995. [Minimum Number of K Consecutive Bit Flips](https://leetcode.com/problems/minimum-number-of-k-consecutive-bit-flips/description/?envType=daily-question&envId=2024-06-24)

## Solution

```java
class Solution {
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        int times = 0;

        for (int i = 0; i < n; i++) {
            if (i >= k) {
                if (nums[i - k] > 1) {
                    nums[i - k] -= 2;
                    times -= 1;
                }
            }

            if ((nums[i] == 1 && times % 2 == 1) || (nums[i] == 0 && times % 2 == 0)) {
                if (i + k > n) return -1;
                ans++;
                times++;
                nums[i] += 2;
            }
        }
        return ans;
    }
}
```
