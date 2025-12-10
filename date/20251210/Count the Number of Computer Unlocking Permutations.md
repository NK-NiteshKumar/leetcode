# 3577. [Count the Number of Computer Unlocking Permutations](https://leetcode.com/problems/count-the-number-of-computer-unlocking-permutations/description/?envType=daily-question&envId=2025-12-10)

## Solution

```java
class Solution {
    static final int MOD = 1_000_000_007;

    public int countPermutations(int[] comp) {
        int n = comp.length;
        int first = comp[0];

        for (int i = 1; i < n; i++) {
            if (comp[i] <= first) return 0;
        }

        long fact = 1;
        for (int i = 2; i < n; i++) {
            fact = (fact * i) % MOD;
        }

        return (int) fact;
    }
}
```
