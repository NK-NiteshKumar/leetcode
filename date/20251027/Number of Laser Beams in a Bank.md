# 2125. [Number of Laser Beams in a Bank](https://leetcode.com/problems/number-of-laser-beams-in-a-bank?envType=daily-question&envId=2025-10-27)

## Solution

```java
class Solution {
    public int numberOfBeams(String[] bank) {
        int number = 0, last = mun(bank[0]);
        for (int i = 1; i < bank.length; i++) {
            int current = mun(bank[i]);
            if (current == 0) continue;
            number += (last * (last = current));
        }
        return number;
    }

    int mun(String s) {
        int res = 0;
        for (int i = 0; i < s.length(); i++)
            res += (s.charAt(i) - '0');
        return res;
    }
}
```

# 📊 [LeetCode service status](https://status.leetcode.com/)
