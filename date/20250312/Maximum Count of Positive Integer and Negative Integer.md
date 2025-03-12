# 2529. [Maximum Count of Positive Integer and Negative Integer](https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/?envType=daily-question&envId=2025-03-12)

## Solution

```java
class Solution {
    public int maximumCount(int[] nums) {
        int neg = 0, n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) continue;
            else if (neg == 0 && nums[i] > 0) return n - i;
            else if (nums[i] < 0) neg++;
            else if (nums[i] > 0) return Math.max(neg, n - i);
        }

        return Math.max(neg, 0);
    }
}
```
