# 3516. [Find Closest Person](https://leetcode.com/problems/find-closest-person/description/?envType=daily-question&envId=2025-09-04)

## Solution

```java
class Solution {
    public int findClosest(int x, int y, int z) 
    {
        int a = Math.abs(z-x);
        int b=Math.abs(z-y);
        if(a==b)
        {
            return 0;
        }
          if(a<b) return 1;
          else  return 2;     
    }
}
```
