# 1877. [Minimize Maximum Pair Sum in Array](https://leetcode.com/problems/minimize-maximum-pair-sum-in-array/description/?envType=daily-question&envId=2026-01-24)

## Solution

```java
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int lp = 0; 
        int rp = nums.length - 1;
        while (lp < rp) {
            sum = Math.max(sum, nums[lp]+nums[rp]);
            lp++;
            rp--;
        }
        return sum;
    }
}
```
