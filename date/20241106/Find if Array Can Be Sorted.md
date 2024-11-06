# 3011. [Find if Array Can Be Sorted](https://leetcode.com/problems/find-if-array-can-be-sorted/description/?envType=daily-question&envId=2024-10-30)

## Solution

```java
class Solution {
    private int setBits(int num) {
        int count = 0;
        for (int i = 31; i >= 0; i--) {
            if ((num >> i & 1) == 1) {
                count++;
            }
        }
        return count;
    }

    private boolean check(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public boolean canSortArray(int[] nums) {
        int[] count = new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            count[j] = setBits(nums[j]);
        }

        int n = nums.length;
        int k = 0;
        while (k < n) {
            for (int i = 1; i < n; i++) {
                if (count[i] == count[i - 1] && nums[i] < nums[i - 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i - 1];
                    nums[i - 1] = temp;
                }
            }
            if (check(nums)) {
                return true;
            }
            k++;
        }
        return false;
    }
}
```
