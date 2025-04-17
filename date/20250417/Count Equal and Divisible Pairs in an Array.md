# 2176. [Count Equal and Divisible Pairs in an Array](https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/description/?envType=daily-question&envId=2025-04-17)

## Solution

```java
class Solution {
    public int countPairs(int[] nums, int k) {
        int pairs = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                    pairs++;
                }
            }
        }
        return pairs;
    }
}
```
