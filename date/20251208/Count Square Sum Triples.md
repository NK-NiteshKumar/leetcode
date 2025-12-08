# 1925. [Count Square Sum Triples](https://leetcode.com/problems/count-square-sum-triples/description/?envType=daily-question&envId=2025-12-08)

## Solution

```java
class Solution {
    public int countTriples(int n) {
        int res = 0;
        for (int u = 2; u * u <= n; u++) {
            for (int v = 1; v < u; v++) {
                if (((u - v) & 1) == 0 || gcd(u, v) != 1) continue;
                int c = u * u + v * v;
                if (c > n) continue;

                res += (n / c) << 1;
            }
        }
        return res;
    }

    int gcd(int x, int y) {
        return y == 0 ? x : gcd(y, x % y);
    }
}

```
