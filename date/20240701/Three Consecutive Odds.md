# 1550. [Three Consecutive Odds](https://leetcode.com/problems/three-consecutive-odds/description/?envType=daily-question&envId=2024-07-01)

## Solution

```java
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        
        for(int i = 0; i < arr.length-2; i++) {
            if(arr[i] % 2 == 1 && arr[i+1] % 2 == 1 && arr[i+2] % 2 == 1) {
                return true;
            }
        }
        return false;
    }
}
```
