# 1550. [Three Consecutive Odds](https://leetcode.com/problems/three-consecutive-odds/description/?envType=daily-question&envId=2025-05-11)

## Solution

```java
class Solution {
  public boolean threeConsecutiveOdds(int[] arr) {
    int count = 0;
    for (final int a : arr) {
      count = a % 2 == 0 ? 0 : count + 1;
      if (count == 3)
        return true;
    }
    return false;
  }
}
```
