# 1248. [Count Number of Nice Subarrays](https://leetcode.com/problems/count-number-of-nice-subarrays/solutions/?envType=daily-question&envId=2024-06-22)
## Solution
```java
class Solution {
    private int numSubarraysLessThanOrEqualToGoal(int[] nums, int goal) {
        int i = 0, j = 0, n = nums.length, count = 0, ans = 0;

        while (j < n) {
            if (nums[j] % 2 == 1) count++;
            while (i <= j && count > goal) {
                if (nums[i] % 2 == 1) count--;
                i++;
            }
            ans += j - i + 1;
            j++;
        }
        return ans;
    }

    public int numberOfSubarrays(int[] nums, int k) {
        return numSubarraysLessThanOrEqualToGoal(nums, k) - 
               numSubarraysLessThanOrEqualToGoal(nums, k - 1);
    }
}
```
