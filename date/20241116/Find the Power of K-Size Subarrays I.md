# 3254. [Find the Power of K-Size Subarrays I](https://leetcode.com/problems/find-the-power-of-k-size-subarrays-i/description/?envType=daily-question&envId=2024-11-16)

## Solution

```java
class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if (k == 1) {
            return nums;
        }
        
        int n = nums.length;
        List<Integer> resultList = new ArrayList<>();
        int left = 0;
        int right = 1;
        
        while (right < n) {
            boolean isNotConsecutive = nums[right] - nums[right-1] != 1;
            
            if (isNotConsecutive) {
                while (left < right && left + k - 1 < n) {
                    resultList.add(-1);
                    left++;
                }
                left = right;
            }
            else if (right - left == k - 1) {
                resultList.add(nums[right]);
                left++;
            }
            
            right++;
        }
        
        int[] result = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }
}
```
