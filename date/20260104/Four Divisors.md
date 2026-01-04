# 1390. [Four Divisors](https://leetcode.com/problems/four-divisors/description/?envType=daily-question&envId=2026-01-04)

## Solution

```java
class Solution {
    public int sumFourDivisors(int[] nums) {
        long total = 0;
        for (int n : nums) {
            int cnt = 0;
            int s = 0;
            int root = (int) Math.sqrt(n);
            for (int i = 1; i <= root; i++) {
                if (n % i == 0) {
                    int j = n / i;

                    if (i == j) {
                        cnt += 1;
                        s += i;
                    } else {
                        cnt += 2;
                        s += i + j;
                    }
                    if (cnt > 4) break;
                }
            }
            if (cnt == 4) {
                total += s;
            }
        }
        return (int) total;
    }
}
```
