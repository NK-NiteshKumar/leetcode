# 2410. [Maximum Matching of Players With Trainers](https://leetcode.com/problems/maximum-matching-of-players-with-trainers/description/?envType=daily-question&envId=2025-07-13)

## Solution

```java
class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Thread t1 = new Thread(() -> Arrays.sort(players));
        Thread t2 = new Thread(() -> Arrays.sort(trainers));
        t1.start(); t2.start();
        try { t1.join(); t2.join(); } catch (Exception ignored) {}

        int count = 0, left = 0, right = 0;
        while (left < players.length && right < trainers.length) {
            if (trainers[right] >= players[left]) { count++; left++; }
            right++;
        }
        return count;
    }
}
```
