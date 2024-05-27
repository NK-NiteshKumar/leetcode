# 1608. [Special Array With X Elements Greater Than or Equal X](https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description/?envType=daily-question&envId=2024-05-27)

## Solution
```java
class Solution {
    public int specialArray(int[] nums) {
        
        int n = nums.length;
        int ct = 0;
        int[] freq = new int[n + 1];

        for (int el : nums) {
            freq[Math.min(n, el)]++;
        }

        for (int i = n; i >= 1; i--) {
            ct += freq[i];
            if (ct == i) {
                return i;
            }
        }

        return -1;
    }
}
```
