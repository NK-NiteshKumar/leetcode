# 1518. [Water Bottles](https://leetcode.com/problems/water-bottles/description/?envType=daily-question&envId=2024-07-07)

## Solution

### Math Trick
```java
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles + (numBottles - 1) / (numExchange - 1);
    }
}
```

### Simulation
```java
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int res = numBottles;
        int cur_empty = numBottles;

        while (cur_empty / numExchange != 0) {
            int full_drinked = cur_empty / numExchange;
            int left_empty = cur_empty - full_drinked * numExchange;
            res += full_drinked;
            cur_empty = left_empty + full_drinked;
        }

        return res;
    }
}
```
