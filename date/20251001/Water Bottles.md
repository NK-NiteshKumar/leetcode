# 1518. [Water Bottles](https://leetcode.com/problems/water-bottles/description/?envType=daily-question&envId=2025-10-01)

## Solution

```java
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles + (numBottles - 1) / (numExchange - 1);
    }
}
```
