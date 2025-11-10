# 3542. [Minimum Operations to Convert All Elements to Zero](https://leetcode.com/problems/minimum-operations-to-convert-all-elements-to-zero/description/?envType=daily-question&envId=2025-11-10)

## Solution

```java
class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int[] stack = new int[n];
        int size = 0;  
        int operations = 0;
        
        for (int num : nums) {
            if (num == 0) {
                operations += size;  
                size = 0;           
                continue;
            }
            
            while (size > 0 && stack[size - 1] > num) {
                size--;        
                operations++;
            }
            
            if (size == 0 || stack[size - 1] < num) {
                stack[size] = num;
                size++;
            }
        }
        
        operations += size; 
        return operations;
    }
}
```
