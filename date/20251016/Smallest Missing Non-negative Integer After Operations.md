# 2598. [Smallest Missing Non-negative Integer After Operations](https://leetcode.com/problems/smallest-missing-non-negative-integer-after-operations/description/?envType=daily-question&envId=2025-10-16)

## Solution

```java
class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int[] remainderCount = new int[value];

        for (int num : nums) {
            int rem = ((num % value) + value) % value;
            remainderCount[rem]++;
        }

        int result = 0;
        while (remainderCount[result % value] > 0) {
            remainderCount[result % value]--;
            result++;
        }

        return result;
    }
}
```

<img width="477" height="285" alt="image" src="https://github.com/user-attachments/assets/2716c9d3-4d3d-4164-965e-379e8fef5264" />
