# 3191. [Minimum Operations to Make Binary Array Elements Equal to One I](https://leetcode.com/problems/minimum-operations-to-make-binary-array-elements-equal-to-one-i/description/?envType=daily-question&envId=2025-03-19)

## Solution

```java
class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length, k = 0;

        for (int i = 0; i <= n - 3; i++) {
            if (nums[i] == 0) {
                nums[i] ^= 1;
                nums[i + 1] ^= 1;
                nums[i + 2] ^= 1;
                k++;
            }
        }

        for (int num : nums) {
            if (num == 0) return -1;
        }
        return k;
    }
}
```
