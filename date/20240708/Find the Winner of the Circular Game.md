# 1823. [Find the Winner of the Circular Game](https://leetcode.com/problems/find-the-winner-of-the-circular-game/?envType=daily-question&envId=2024-07-08)

## Solution

```java
class Solution {
    public int findTheWinner(int n, int k) {
        int res = 0;
        for (int playerNum = 2; playerNum <= n; ++playerNum) {
            res = (res + k) % playerNum;
        }
        return res + 1;
    }
}
```
