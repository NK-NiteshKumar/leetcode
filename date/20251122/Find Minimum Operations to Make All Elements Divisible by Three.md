# 3190. [Find Minimum Operations to Make All Elements Divisible by Three](https://leetcode.com/problems/find-minimum-operations-to-make-all-elements-divisible-by-three/description/?envType=daily-question&envId=2025-11-22)

## Solution

```java
class Solution {
    public int minimumOperations(int[] nums) {
        int cnt = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 3 == 0){
                continue;
            } else {
                cnt += 1;
            }
        }
        return cnt;
    }
}
```
