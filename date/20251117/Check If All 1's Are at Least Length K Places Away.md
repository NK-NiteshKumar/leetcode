# 1437. [Check If All 1's Are at Least Length K Places Away](https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/description/?envType=daily-question&envId=2025-11-17)

## Solution

```java
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int prev = -1;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (prev != -1 && i - prev - 1 < k)
                    return false;
                prev = i;
            }
        }
        return true;
    }
}
```
