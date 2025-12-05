# 3432. [Count Partitions with Even Sum Difference](https://leetcode.com/problems/count-partitions-with-even-sum-difference/description/?envType=daily-question&envId=2025-12-05)

## Solution

```java
class Solution {
    public int countPartitions(int[] nums) {
        int totalSum = 0;
        for (int i=0;i<nums.length;i++) {
            totalSum += nums[i]; 
        }

        int leftSum = 0;
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) { 
            leftSum += nums[i]; 
            int rightSum = totalSum - leftSum; 
  
            if ((leftSum % 2) == (rightSum % 2)) {
                count++; 
            }
        }
        return count; 
    }
    }
```
