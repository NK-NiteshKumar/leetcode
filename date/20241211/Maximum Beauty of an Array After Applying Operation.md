# 2779. [Maximum Beauty of an Array After Applying Operation](https://leetcode.com/problems/maximum-beauty-of-an-array-after-applying-operation/description/?envType=daily-question&envId=2024-12-11)

## Solution

```java
class Solution {
    public int maximumBeauty(int[] nums, int k) {
        if (nums.length == 1)
            return 1;

        int maxBeauty = 0;
        int maxValue = 0;

        for (int num : nums)
            maxValue = Math.max(maxValue, num);

        int[] count = new int[maxValue + 1];

        for (int num : nums) {
            count[Math.max(num - k, 0)]++;
            count[Math.min(num + k + 1, maxValue)]--;
        }

        int currentSum = 0;

        for (int val : count) {
            currentSum += val;
            maxBeauty = Math.max(maxBeauty, currentSum);
        }

        return maxBeauty;
    }
}
```
