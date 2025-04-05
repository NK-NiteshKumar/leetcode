# 1863. [Sum of All Subset XOR Totals](https://leetcode.com/problems/sum-of-all-subset-xor-totals/description/?envType=daily-question&envId=2025-04-05)

## Solution

```java
class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums, 0, 0);
    }
    public int helper(int nums[], int level, int currentXOR){
        if(level == nums.length) return currentXOR;
        int include = helper(nums, level + 1, currentXOR^nums[level]);
        int exclude = helper(nums, level + 1, currentXOR);
        
        return include + exclude;
    }
}
```
