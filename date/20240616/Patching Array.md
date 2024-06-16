# 330. [Patching Array](https://leetcode.com/problems/patching-array/description/?envType=daily-question&envId=2024-06-16)

## Solution

```java
class Solution {
    public int minPatches(int[] nums, int n) {
        long minNumberPatches = 0, maxNumber = 0;
        int i = 0, len = nums.length;

        while (maxNumber < n) {
            if (i < len && maxNumber + 1 >= nums[i]) {
                maxNumber += nums[i];
                i++;
            } else {
                minNumberPatches++;
                maxNumber += (maxNumber + 1);
            }
        }
        return (int) minNumberPatches;
    }
}
```
