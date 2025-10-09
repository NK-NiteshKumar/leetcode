# 3494. [Find the Minimum Amount of Time to Brew Potions](https://leetcode.com/problems/find-the-minimum-amount-of-time-to-brew-potions/description/?envType=daily-question&envId=2025-10-09)

## Solution

```java
class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length, m = mana.length;
        long[] prevEnd = new long[n];
        prevEnd[0] = skill[0] * mana[0];
        for(int i=1;i<n;i++) {
            prevEnd[i] = prevEnd[i-1] + skill[i] * mana[0];
        }
        for(int j=1;j<m;j++) {
            long delay = 0;
            long time = 0;
            for(int i=0;i<n;i++) {
                if(time >= prevEnd[i]) {
                    time += skill[i] * mana[j];
                } else {
                    delay += (prevEnd[i] - time);
                    time = prevEnd[i] + skill[i] * mana[j];
                }
            }
            prevEnd[0] = delay + skill[0] * mana[j];
            for(int i=1;i<n;i++) {
                prevEnd[i] = prevEnd[i-1] + skill[i] * mana[j];
            }
        }
        return prevEnd[n-1];
    }
}
```
