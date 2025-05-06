# 1920. [Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/description/?envType=daily-question&envId=2025-05-06)

## Solution

```java
class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int newVal = nums[nums[i]] % n;
            nums[i] += newVal * n;
        }
        for (int i = 0; i < n; i++) {
            nums[i] /= n;
        }
        return nums;
    }
}
```
