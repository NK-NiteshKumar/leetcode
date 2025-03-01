# 2460. [Apply Operations to an Array](https://leetcode.com/problems/apply-operations-to-an-array/description/?envType=daily-question&envId=2025-03-01)

## Solution

```java
class Solution {
    public int[] applyOperations(int[] nums) {
        int[] result = new int[nums.length];
        int count = 0;
        int i;
        for(i = 0; i < nums.length - 1; i++){
            if(nums[i] != 0){
                if(nums[i] == nums[i + 1]){
                    result[count] = nums[i] * 2;
                    i++;
                }
                else{
                    result[count] = nums[i];
                }
                count++;
            }
        }
        if(i != nums.length){
            result[count] = nums[nums.length - 1];
        }
        return result;
    }
}
```
