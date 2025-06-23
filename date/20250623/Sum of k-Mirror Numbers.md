# 2081. [Sum of k-Mirror Numbers](https://leetcode.com/problems/sum-of-k-mirror-numbers/description/?envType=daily-question&envId=2025-06-23)

## Solution

```java
class Solution {
    private boolean isMirror(long num, int k) {
        long mul = 1;
        while (mul * k <= num) mul *= k;

        for (; num > 0; mul /= k * k) {
            long msd = num / mul;
            long lsd = num % k;
            if (msd != lsd) return false;
            num = (num - msd * mul - lsd) / k;
        }
        return true;
    }

    private long genPalindrome(long num, boolean odd) {
        long tmp = (odd) ? num / 10 : num;
        while (tmp > 0) {
            num = num * 10 + tmp % 10;
            tmp /= 10;
        }
        return num;
    }

    public long kMirror(int k, int n) {
        long sum = 0, nextPrefix;
        for (long prefix = 1; n > 0; prefix = nextPrefix) {
            nextPrefix = prefix * 10;
            for (long i = prefix; n > 0 && i < nextPrefix; ++i) {
                long p = genPalindrome(i, true);
                if (isMirror(p, k)) {
                    sum += p;
                    --n;
                }
            }

            for (long i = prefix; n > 0 && i < nextPrefix; ++i) {
                long p = genPalindrome(i, false);
                if (isMirror(p, k)) {
                    sum += p;
                    --n;
                }
            }
        }
        return sum;
    }
}
```
