# 2302. [Count Subarrays With Score Less Than K](https://leetcode.com/problems/count-subarrays-with-score-less-than-k/description/?envType=daily-question&envId=2025-04-28)

## Solution

```java
class Solution 
{
    public long countSubarrays(int[] nums, long k) 
    {
        int n = nums.length;
        long result = 0; 
        long sum = 0;    

        int i = 0;
        int j = 0;

        while (j < n) 
        {
            sum += nums[j];

            while (i <= j && sum * (j - i + 1) >= k) 
            {
                sum -= nums[i];
                i++;  
            }

            result += (j - i + 1);

            j++;
        }

        return result;
    }
}
```
