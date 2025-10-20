# 2011. [Final Value of Variable After Performing Operations](https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/?envType=daily-question&envId=2025-10-20)

## Solution

```java
class Solution {
    public int finalValueAfterOperations(String[] o) {
        int x = 0;
        int l = o.length;
        for(int i = 0;i<l;i++){
            if(o[i].charAt(0)=='+'||o[i].charAt(2)=='+') x++;
            else x--;
        }
        return x;
    }
}
```
