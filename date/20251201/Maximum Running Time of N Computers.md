# 2141. [Maximum Running Time of N Computers](https://leetcode.com/problems/maximum-running-time-of-n-computers/description/?envType=daily-question&envId=2025-12-01)

## Solution

```java
class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long totalEnergy = 0;
        for (int battery : batteries) {
            totalEnergy += battery;
        }

        Arrays.sort(batteries);

        for (int i = batteries.length - 1; i >= 0; i--) {
            if (batteries[i] > totalEnergy / n) {
                totalEnergy -= batteries[i];
                n--;
            } else {
                break;
            }
        }

        return totalEnergy / n;
    }

}
```
