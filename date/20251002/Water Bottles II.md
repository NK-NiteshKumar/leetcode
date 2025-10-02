# 3100. [Water Bottles II](https://leetcode.com/problems/water-bottles-ii/description/?envType=daily-question&envId=2025-10-02)

## Solution

```java
class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int bottleDrunk = numBottles;
        int emptyBottles = numBottles;

        while (emptyBottles >= numExchange) {
            emptyBottles -= numExchange;
            numExchange++;
            bottleDrunk++;
            emptyBottles++;
        }
        return bottleDrunk;
    }
}
```
